package singleton;

/**
 * 多线程优化方法
 * 1.同步(synchronized) getChocolateFactory方法
 * 2.急切创建实例 private static ChocolateFactory chocolateFactory = new ChocolateFactory();
 * 3.双重检查加锁（涉及到频繁调用getChocolateFactory()方法时）
 */
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateFactory chocolateFactory = null;
    private ChocolateFactory(){
        empty = true;
        boiled = true;
    }

    public static ChocolateFactory getChocolateFactory(){
        //有两个线程，第一个线程已经调用这方法了，进入共享块了，
        // 如果它还没创建好时另一个线程调用这方法必须等等
        /**
         * 有两个线程，第一个线程已经调用这方法了，进入共享块了，
         * 如果它还没创建好时另一个线程调用这方法必须等待
         * 如果如果它已经创建好时另一个线程调用这方法直接可以通过
         * 就可以有效的防止阻塞了
         */

        if(chocolateFactory==null){
            synchronized (ChocolateFactory.class){
                if(chocolateFactory==null) {
                    chocolateFactory = new ChocolateFactory();
                }
            }
        }
        return chocolateFactory;
    }
    public void fill() {
        if (empty) {
            // 添加原料巧克力动作
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if ((!empty) && boiled) {
            // 排出巧克力动作
            empty = true;
        }
    }

    public void boil() {
        if ((!empty) && (!boiled)) {
            // 煮沸
            boiled = true;
        }
    }
}

package facade.entity;

/**
 * @ClassName Popcorn
 * @Description 爆米花机器
 * @Author Duplicator
 * @Date 2019/5/16 10:33
 * @Version 1.0
 **/
public class Popcorn {
    private static Popcorn instance =null;
    private Popcorn(){

    }
    public static Popcorn getInstance(){
        if (instance==null){
            instance= new Popcorn();
        }
        return instance;
    }
    public void on(){
        System.out.println("Popcorn on");
    }
    public void off(){
        System.out.println("Popcorn off");
    }

    public void pop(){
        System.out.println("Popcorn popping");
    }
}

package factory.pizza;

/**
 * @ClassName Pizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 10:12
 * @Version 1.0
 **/
public abstract class Pizza {
    protected String name;
    public abstract  void prepare();
    public void bake(){
        System.out.println(name+":baking;");
    }
    public void cut(){
        System.out.println(name+":cutting;");
    }
    public void box(){
        System.out.println(name+" boxing;");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

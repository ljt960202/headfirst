package composite;

/**
 * @ClassName MenuItem
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/22 9:33
 * @Version 1.0
 **/
public class MenuItem extends MenuComponent {
    private String name,description;
    private boolean vegetable;
    private float price;
    public MenuItem(String name,String description,boolean vegetable,float price){
        this.name = name;
        this.description = description;
        this.vegetable = vegetable;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public boolean isVegetable() {
        return vegetable;
    }

    @Override
    public void print() {
        System.out.println(getName()+"***"+getPrice()+"***"+getDescription());
    }
}

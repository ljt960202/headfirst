package iterator;

/**
 * @ClassName MenuItem
 * @Description 菜单项
 * @Author Duplicator
 * @Date 2019/5/21 9:49
 * @Version 1.0
 **/
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetable;
    private float price;

    public MenuItem(String name, String description, boolean vegetable, float price) {
        this.name = name;
        this.description = description;
        this.vegetable = vegetable;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetable() {
        return vegetable;
    }

    public float getPrice() {
        return price;
    }
}

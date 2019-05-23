package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName CakeHouseMenu
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/22 10:03
 * @Version 1.0
 **/
public class CakeHouseMenu extends MenuComponent {
    private ArrayList<MenuComponent>  menuItems;
    public CakeHouseMenu() {
        menuItems = new ArrayList<MenuComponent>();
        addItem("KFC Cake Breakfast","boiled eggs&toast&cabbage",true,3.12f);
        addItem("MDL Cake Breakfast","fried eggs&toast",false,3.59f);
        addItem("Stawberry Cake","fresh stawberry",true,3.29f);
        addItem("Regular Cake Breakfast","toast&sausage",true,2.59f);

    }
    private void addItem(String name,String description, boolean vegetable,float price){
        MenuItem menuItem = new MenuItem(name,description,vegetable,price);
        menuItems.add(menuItem);
    }
    public Iterator getIterator(){
        return new CompositeIterator(menuItems.iterator());
    }
    @Override
    public void print() {
        System.out.println("****This is CakeHouseMenu****");
    }
}

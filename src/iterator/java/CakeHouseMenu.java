package iterator.java;

import iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName CakeHouseMenu
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/21 9:57
 * @Version 1.0
 **/
public class CakeHouseMenu {
    private List<MenuItem> menuItems;

    public CakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("KFC Cake Breakfast","boiled eggs&toast&ccabbage",true,3.99f);
        addItem("MDL Cake Breakfast","fried eggs&toast",false,3.59f);
        addItem("Stawberry Cake","fresh Stawberry",true,3.29f);
        addItem("Regular Cake Breakfast","toast&sausage",true,2.59f);
    }

    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name,description,vegetable,price);
        menuItems.add(menuItem);
    }

    public Iterator getIterator(){
        return menuItems.iterator();
    }


}

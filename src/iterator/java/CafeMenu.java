package iterator.java;

import iterator.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @ClassName CafeMenu
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/21 16:00
 * @Version 1.0
 **/
public class CafeMenu  {
    private Hashtable<String, MenuItem> hashtable ;
    public CafeMenu(){
        hashtable = new Hashtable<String, MenuItem>();
        addItem("Moca Burger","moca&bruger&tomato",true,3.56f);
        addItem("Soup Latte","latte&salad&soup",true,3.26f);
        addItem("Burrito","bacon&tomato&beans",false,3.96f);
    }

    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name,description,vegetable,price);
        hashtable.put(name,menuItem);
    }

    public Iterator getIterator(){
        return hashtable.values().iterator();
    }
}

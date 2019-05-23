package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName SubMenu
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/22 9:35
 * @Version 1.0
 **/
public class SubMenu extends MenuComponent {
    private ArrayList<MenuComponent> menuItems;
    public SubMenu(){
        menuItems = new ArrayList<MenuComponent>();
        addItem("Apple Cookie","Apple&candy&Cookie",true,1.99f);
        addItem("Banana Cookie","Banana&candy&Cookie",false,1.59f);
        addItem("Orange Cookie","Orange&candy&Cookie",true,1.29f);
    }
    private void addItem(String name,String description,boolean vegetable,float price){
        MenuItem menuItem = new MenuItem(name,description,vegetable,price);
        menuItems.add(menuItem);
    }
    public Iterator getIterator(){
        return new CompositeIterator(menuItems.iterator());
    }

    @Override
    public void print() {
        System.out.println("****This is SubMenu****");
    }
}

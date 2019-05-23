package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Waitress
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/22 10:26
 * @Version 1.0
 **/
public class Waitress {
    private ArrayList<MenuComponent> iterators = new ArrayList<MenuComponent>();

    public Waitress() {
    }
    public void addComponent(MenuComponent menuComponent){
        iterators.add(menuComponent);
    }
    public void printMenu(){
        Iterator iterator;
        MenuComponent menuItem;
        for (int i = 0; i < iterators.size(); i++) {
            iterators.get(i).print();
            iterator = iterators.get(i).getIterator();
            while (iterator.hasNext()){
                menuItem = (MenuComponent)iterator.next();
                menuItem.print();
            }
        }
    }

    public void printVegetableMenu(){
        Iterator iterator;
        MenuComponent menuItem;
        for (int i = 0; i < iterators.size(); i++) {
            iterators.get(i).print();
            iterator = iterators.get(i).getIterator();
            while (iterator.hasNext()){
                menuItem = (MenuComponent) iterator.next();
                if (menuItem.isVegetable()){
                    menuItem.print();
                }
            }
        }
    }
}

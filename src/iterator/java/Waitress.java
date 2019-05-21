package iterator.java;

import iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Waitress
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/21 10:11
 * @Version 1.0
 **/
public class Waitress {

    private List<Iterator> iterators = new ArrayList<Iterator>();


    public Waitress() {
    }

    public void addIterator(Iterator iterator){
        iterators.add(iterator);
    }

    public void printMenu(){
        Iterator iterator;
        MenuItem menuItem;
        for (int i = 0; i < iterators.size(); i++) {
            iterator = iterators.get(i);
            while (iterator.hasNext()){
                menuItem = (MenuItem)iterator.next();
                System.out.println(menuItem.getName()+"***"
                        +menuItem.getPrice()+"***"
                        +menuItem.getDescription()
                );
            }
        }
    }
    public void printBreakfastMenu(){

    }
    public void printLunchMenu(){

    }
    public void printVegetableMenu(){

    }
}

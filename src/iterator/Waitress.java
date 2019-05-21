package iterator;

import java.util.ArrayList;
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
            while (iterator.hasNest()){
                menuItem = (MenuItem)iterator.next();
                System.out.println(menuItem.getName()+"***"
                        +menuItem.getPrice()+"***"
                        +menuItem.getDescription()
                );
            }
        }
/*        for (MenuItem cakeItem : cakeItems) {
            System.out.println(cakeItem.getName()+"***"
                    +cakeItem.getPrice()+"***"
                    +cakeItem.getDescription()
            );
        }
        //dinerMenu.numberOfItems 数组里面实际内容有几个 而不是数组的容量有几个
        for (int i = 0; i < dinerMenu.numberOfItems; i++) {
            System.out.println(dinerItems[i].getName()+"***"
                    +dinerItems[i].getPrice()+"***"
                    +dinerItems[i].getDescription()
            );
        }*/

    }
    public void printBreakfastMenu(){

    }
    public void printLunchMenu(){

    }
    public void printVegetableMenu(){

    }
}

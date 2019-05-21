package iterator.java;


import iterator.MenuItem;

import java.util.Iterator;

/**
 * @ClassName DinerMenu
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/21 10:06
 * @Version 1.0
 **/
public class DinerMenu {
    private MenuItem[] menuItems;
    private final static  int Max_Items=5;
    public int numberOfItems=0;
    public DinerMenu() {
        menuItems = new MenuItem[Max_Items];
        addItem("vegetable Blt","bacon&lettuce&tomato&cabbage",true,3.58f);
        addItem("Blt","bacon&lettuce&tomato",false,3.00f);
        addItem("bean soup","bean&potato salad",true,3.28f);
        addItem("hotdog","onions&cheese&bread",false,3.05f);
    }

    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name,description,vegetable,price);
        if (numberOfItems>Max_Items){
            System.out.println("sorry,menu is full!");
        }else {
            menuItems[numberOfItems]=menuItem;
            numberOfItems++;
        }
    }

    public Iterator getIterator(){
        return new DinerMenuIterator();
    }

    class DinerMenuIterator implements Iterator {
        private int position;

        public DinerMenuIterator(){
            position =0;
        }

        @Override
        public boolean hasNext() {
            if(position<numberOfItems){
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            MenuItem menuItem= menuItems[position++];
            return menuItem;
        }
        @Override
        public void remove() {

        }


    }


}

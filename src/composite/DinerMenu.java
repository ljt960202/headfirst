package composite;

import java.util.Iterator;

/**
 * @ClassName DinerMenu
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/22 9:43
 * @Version 1.0
 **/
public class DinerMenu extends MenuComponent {
    private final static  int MAX_ITEMS = 5;
    private int numberOfItems = 0;
    private MenuComponent[] menuItems;

    public DinerMenu() {
        menuItems = new MenuComponent[MAX_ITEMS];
        addItem("vegetable Blt","bacon&lettuce&tomato&cabbage",true,3.88f);
        addItem("Blt","bacon&lettuce&tomato",false,3.00f);
        addItem("bean soup","bean&potato salad",true,3.28f);
        addItem("hotdog","onions&cheese&bread",false,3.05f);
        addSubMenu(new SubMenu());
    }
    private void addItem(String name,String description,boolean vegetable,float price){
        MenuItem menuItem = new MenuItem(name,description,vegetable,price);
        if(numberOfItems>=MAX_ITEMS){
            System.out.println("sorry,menu is full!");
        }else{
            menuItems[numberOfItems++]=menuItem;
        }
    }
    public Iterator getIterator(){
        return new CompositeIterator(new DinerMenuIterator());
    }

    private void addSubMenu(MenuComponent menuComponent){
        if(numberOfItems>=MAX_ITEMS){
            System.out.println("sorry,menu is full!");
        }else{
            menuItems[numberOfItems++]=menuComponent;
        }
    }

    @Override
    public void print() {
        System.out.println("****This is DinnerMenu****");
    }

    class DinerMenuIterator implements Iterator{
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
            MenuComponent menuItem= menuItems[position++];
            return menuItem;
        }
    }
}

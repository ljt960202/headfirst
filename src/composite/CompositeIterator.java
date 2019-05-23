package composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * @ClassName CompositeIterator
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/22 10:01
 * @Version 1.0
 **/
public class CompositeIterator implements Iterator {
    private Stack<Iterator> stack = new Stack<Iterator>();
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public void remove() {

    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }
        Iterator iterator = stack.peek();
        if(!iterator.hasNext()){
            stack.pop();
            return hasNext();
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = stack.peek();
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            stack.push(menuComponent.getIterator());
            return menuComponent;
        }
        return null;
    }

}

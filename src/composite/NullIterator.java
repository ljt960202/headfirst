package composite;

import java.util.Iterator;

/**
 * @ClassName NullIterator
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/22 9:55
 * @Version 1.0
 **/
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }
}

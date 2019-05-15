package adapter.enumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @ClassName EnumerationIterator
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/15 10:39
 * @Version 1.0
 **/
public class EnumerationIterator implements Iterator<Object> {
    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
    //因为枚举没有remove，而迭代器需要有所以重写并返回异常
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

package composite;

import java.util.Iterator;

/**
 * @ClassName MenuComponent
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/22 9:19
 * @Version 1.0
 **/
public abstract class MenuComponent {
    public String getName(){
        return "";
    }
    public String getDescription(){
        return "";
    }
    public float getPrice(){
        return 0;
    }
    public boolean isVegetable(){
        return false;
    }

    public abstract void print();

    public Iterator getIterator(){
        return new NullIterator();
    }
}

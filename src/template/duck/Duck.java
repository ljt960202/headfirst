package template.duck;

/**
 * @ClassName Duck
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/17 14:46
 * @Version 1.0
 **/
public class Duck implements Comparable{
    String name = "";
    int weight =1;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name+" weight:"+weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck)o;
        if(this.weight>duck.weight){
            return 1;
        }else if(this.weight<duck.weight){
            return -1;
        }
        return 0;
    }
}

package template.duck;

/**
 * @ClassName SortTemplate
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/17 14:47
 * @Version 1.0
 **/
public abstract class SortTemplate {
    public final void sort(Object[] objects){
        for (int i = 0; i < objects.length-1; i++) {
            if(campare(objects[i+1])>0){

            }else{

            }
        }
    }
    public abstract int campare(Object object);
}

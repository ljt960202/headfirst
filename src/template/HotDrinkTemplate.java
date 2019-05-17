package template;

/**
 * @ClassName HotDrink
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/17 14:19
 * @Version 1.0
 **/
public abstract class HotDrinkTemplate {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (wantCondimentsHook()){
            addCondiments();
        }else {
            System.out.println("No Condiments");
        }

    }

    public boolean wantCondimentsHook(){
        return true;
    }

    public abstract void brew();
    public abstract void addCondiments();
    public final void boilWater(){
        System.out.println("boiling water");
    }

    public final void pourInCup(){
        System.out.println("Pouring into Cup");
    }
}

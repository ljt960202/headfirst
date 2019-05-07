package observer.jv;



/**
 * 测试java内置观察者对象
 */
public class Test {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();
        WeatherDataSt weatherDataSt = new WeatherDataSt();
        weatherDataSt.addObserver(currentConditions);
        weatherDataSt.addObserver(forcastConditions);
        weatherDataSt.setData(10,20,30);
        //移除一个观察者
        weatherDataSt.deleteObserver(currentConditions);
        weatherDataSt.setData(12,22,32);
    }
}

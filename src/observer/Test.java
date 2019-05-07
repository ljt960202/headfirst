package observer;

public class Test {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();
        WeatherDataSt weatherDataSt = new WeatherDataSt();
        weatherDataSt.registerObserver(currentConditions);
        weatherDataSt.registerObserver(forcastConditions);
        weatherDataSt.setData(10,20,30);
        //移除一个观察者
        weatherDataSt.removeObserver(currentConditions);
        weatherDataSt.setData(12,22,32);

    }
}

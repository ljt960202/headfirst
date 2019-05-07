package observer.jv;

import java.util.Observable;
import java.util.Observer;

public class ForcastConditions implements Observer {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    public void update(Observable o, Object data) {
        this.mHumidity = ((Data)(data)).getmHumidity();
        this.mPressure = ((Data)(data)).getmPressure();
        this.mTemperatrue = ((Data)(data)).getmTemperatrue();
        display();
    }
    public void display()
    {
        System.out.println("**明天温度:"+(mTemperatrue+Math.random())+"**");
        System.out.println("**明天气压:"+(mPressure+10*Math.random())+"**");
        System.out.println("**明天湿度:"+(mHumidity+Math.random())+"**");
    }
}

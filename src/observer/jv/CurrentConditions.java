package observer.jv;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    public void update(Observable o, Object data) {
        this.mHumidity = ((Data)(data)).getmHumidity();
        this.mPressure = ((Data)(data)).getmPressure();
        this.mTemperatrue = ((Data)(data)).getmTemperatrue();
        display();
    }

    public void display() {
        System.out.println("***Today mTemperatrue:" + mTemperatrue + "***");
        System.out.println("***Today mPressure:" + mPressure + "***");
        System.out.println("***Today mHumidity:" + mHumidity + "***");

    }
}

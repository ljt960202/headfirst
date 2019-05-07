package observer.jv;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherDataSt extends Observable {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    public float getmTemperatrue() {
        return mTemperatrue;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }


    public void dataChange(){
        this.setChanged();
        this.notifyObservers(new Data(getmTemperatrue(),getmPressure(),getmHumidity()));
    }


    public void setData(float mTemperatrue,float mPressure,float mHumidity){
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

}

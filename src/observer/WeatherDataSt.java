package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSt implements Subject{
    private List<Observer> list;
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

    public WeatherDataSt(){
        list = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(list.contains(observer)){
            list.remove(observer);
        }
    }

    public void dataChange(){
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update(getmTemperatrue(),getmPressure(),getmHumidity());
        }
    }

    public void setData(float mTemperatrue,float mPressure,float mHumidity){
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

}

package weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        this.observers = new ArrayList<Observer>();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        measurementChange();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        measurementChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        measurementChange();
    }

    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update();
        }
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementChange();
    }

    public void measurementChange(){
        notifyObserver();
    }
}

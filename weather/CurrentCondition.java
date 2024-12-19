package weather;

public class CurrentCondition implements Observer,Display{

    private WeatherData weatherData;
    private float temperature;
    private  float humidity;
    private  float pressure;

    public CurrentCondition(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(){
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
        this.display();
    }

    public void display(){
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity"
                + pressure + "pressure");
    }
}

package weather;

public class Statistic implements Observer,Display{
    private float min_temp = 0;
    private float max_temp = 0;
    private float min_humidity = 0;
    private float max_humidity = 0;
    private float min_pressure =0;
    private float max_pressure =0;
    private float count = 0 ;

    private float total_temp = 0;
    private float total_humidity = 0;
    private  float total_pressure = 0;

    private float temp_avg = 0;
    private float humidity_avg = 0;
    private float pressure_avg = 0;



    private WeatherData weatherData;

    public Statistic(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }


    public void update(){
        count++;
        float temperature = this.weatherData.getTemperature();
        total_temp += temperature;
        temp_avg = total_temp / count;
        float humidity = this.weatherData.getHumidity();
        total_humidity += humidity;
        humidity_avg = total_humidity / count;
        float pressure = this.weatherData.getPressure();
        total_pressure += pressure;
        pressure_avg = total_pressure / count;

        if(temperature > max_temp){
            this.max_temp = temperature;
        }

        if(temperature < min_temp){
            this.min_temp = temperature;
        }
        if(humidity > max_humidity){
            this.max_humidity = humidity;
        }

        if(humidity < min_humidity){
            this.min_humidity = humidity;
        }
        if(pressure > max_pressure){
            this.max_pressure = pressure;
        }

        if(pressure < min_pressure){
            this.min_pressure = pressure;
        }

        this.display();
    }

    public void display(){
        System.out.println("Lowest temperature: " + min_temp + "F degrees \n "+
                "Highest temperature: " + max_temp + "F degrees \n " +
                "Average temperature: " + temp_avg + "F degrees \n " +
                "Lowest Humidity: " + min_humidity + "% \n " +
                "Highest Humidity: " + max_humidity + "% \n " +
                "Average Humidity: " + humidity_avg + "% \n " +
                "Lowest Pressure: " + min_pressure + "% \n " +
                "Highest Pressure: " + max_pressure + "% \n " +
                "Average Pressure: " + pressure_avg + "% \n " );
    }
}

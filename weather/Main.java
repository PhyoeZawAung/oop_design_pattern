package weather;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentCondition currentCondition = new CurrentCondition(weatherData);
        Statistic statistic = new Statistic(weatherData);
        weatherData.setData(100,10,10);
        weatherData.setData(100,10,10);
        weatherData.setData(100,10,10);

    }
}

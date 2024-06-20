public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay display = new TemperatureDisplay();
        WeatherWarning warning = new WeatherWarning();

        weatherStation.addObserver(display);
        weatherStation.addObserver(warning);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(35);
    }
}
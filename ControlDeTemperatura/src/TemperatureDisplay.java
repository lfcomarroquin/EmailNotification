public class TemperatureDisplay implements Observer{
    public void update(int temperature) {
        System.out.println("La temperatura actual es de " + temperature + "°C");
    }
}

class WeatherWarning implements Observer {
    private static final int TEMPERATURE_THRESHOLD = 30;

    public void update(int temperature) {
        if (temperature > TEMPERATURE_THRESHOLD) {
            System.out.println("Advertencia: La temperatura ha superado el umbral! Por favor, tomar las precauciones pertinentes");
        }
    }
}

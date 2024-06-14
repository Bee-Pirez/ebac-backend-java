public class Temperature {
    private double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Double convertToFahrenheit() {
        Double tempWrapper = Double.valueOf(temperature);
        return (temperature * 9 / 5) + 32;
    }
}

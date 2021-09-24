package com.company.Task10;

public class Period {
    public Period(final Day Day, final TypeWeather typeWeather, final double temperature, final Integer atmosphericPressure, final Integer humidity) {
        this.Day = Day;
        this.weather.setTypeWeather (typeWeather);
        this.weather.setTemperature (temperature);
        this.weather.setAtmosphericPressure (atmosphericPressure);
        this.weather.setHumidity (humidity);
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(final Weather weather) {
        this.weather = weather;
    }

    public Day getNameOfDay() {
        return Day;
    }

    private Weather weather = new Weather ();
    private final Day Day;

    @Override
    public int hashCode() {
        return this.getWeather().hashCode() + 50 * getNameOfDay().hashCode();
    }

    @Override
    public String toString() {
        return "Day{" +
                " nameOfDay=" + Day+" " + weather  +
                '}';
    }
}

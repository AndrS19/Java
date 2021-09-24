package com.company.Task10;

public class Weather {
    private TypeWeather typeWeather;
    private double temperature;
    private Integer atmosphericPressure;
    private Integer humidity;

    @Override
    public String toString() {
        return "Weather{" +
                "typeWeather=" + typeWeather +
                ", temperature=" + temperature +
                ", atmosphericPressure='" + atmosphericPressure + '\'' +
                ", humidity='" + humidity + '\'' +
                '}';
    }

    public TypeWeather getTypeWeather() {
        return typeWeather;
    }

    public void setTypeWeather(final TypeWeather typeWeather) {
        this.typeWeather = typeWeather;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(final double temperature) {
        this.temperature = temperature;
    }

    public Integer getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(final Integer atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(final Integer humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final Weather weather = (Weather) obj;
        return this.getTemperature() == weather.getTemperature()
                && (this.getTypeWeather() == weather.getTypeWeather()
                || (this.getTypeWeather() != null && this.getTypeWeather().equals(weather.getTypeWeather())))
                && (this.getAtmosphericPressure() == weather.getAtmosphericPressure())
                && (this.getHumidity() == weather.getHumidity());
    }
    @Override
    public int hashCode() {
        return (int) (40 * this.getTemperature() +
                40 * this.getTypeWeather().hashCode() +
                40 * this.getAtmosphericPressure ()+
                40 * this.getHumidity());
    }
}

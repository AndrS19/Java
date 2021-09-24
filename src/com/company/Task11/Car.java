package com.company.Task11;

import java.util.List;

public class Car {
    private Integer carNumber;
    private String nameCar;
    private String carColor;
    private List<Driver> driver;

    public Car(Integer carNumber, String nameCar, String carColor, List<Driver> driver) {
        this.carNumber = carNumber;
        this.nameCar = nameCar;
        this.carColor = carColor;
        this.driver = driver;
    }

    public List<Driver> getDriver() {
        return driver;
    }

    public void setDriver(List<Driver> driver) {
        this.driver = driver;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Integer carNumber) {
        this.carNumber = carNumber;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    @Override
    public String toString() {
        return "Car{" +
                "carNumber=" + carNumber +
                ", nameCar='" + nameCar + '\'' +
                ", carColor='" + carColor + '\'' +
                ", driver=" + driver +
                '}' + super.toString ();
    }
}

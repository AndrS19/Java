package com.company.Task11;

public class Order {
    private int numberOfOrder;
    private double priseOfOrder;
    private double timeToArrival;
    private String paymentMethod;
    private Car car;

    public Order(int numberOfOrder, double priseOfOrder, double timeToArrival, String paymentMethod, Car car) {
        this.numberOfOrder = numberOfOrder;
        this.priseOfOrder = priseOfOrder;
        this.timeToArrival = timeToArrival;
        this.paymentMethod = paymentMethod;
        this.car = car;
    }
    @Override
    public String toString() {
        return "Order{" +
                "numberOfOrder=" + numberOfOrder +
                ", priseOfOrder=" + priseOfOrder +
                ", timeToArrival=" + timeToArrival +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", car=" + car +
                '}';
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public double getPriseOfOrder() {
        return priseOfOrder;
    }

    public void setPriseOfOrder(double priseOfOrder) {
        this.priseOfOrder = priseOfOrder;
    }

    public double getTimeToArrival() {
        return timeToArrival;
    }

    public void setTimeToArrival(double timeToArrival) {
        this.timeToArrival = timeToArrival;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}

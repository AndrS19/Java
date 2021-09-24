package com.company.Task11;

import java.util.List;

public class Client extends Person{
    private Integer phone;
    List<Order> orders;

    public Client(String firstName, String lastName, double age, Integer phone, List<Order> orders) {
        super(firstName, lastName, age);
        this.phone = phone;
        this.orders = orders;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Client {" +
                "phone = " + phone + "} " + super.toString();
    }
}

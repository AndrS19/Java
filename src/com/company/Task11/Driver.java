package com.company.Task11;

public class Driver extends Person{
    private Integer phone;

    public Driver(String firstName, String lastName, double age, Integer phone) {
        super(firstName, lastName, age);
        this.phone = phone;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "phone=" + phone + super.toString ();
    }
}

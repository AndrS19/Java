package com.company.Task11;

public abstract class Person {
    private String firstName;
    private String LastName;
    private double age;

    public Person(String firstName, String lastName, double age) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                        ", LastName='" + LastName + '\'' +
                        ", age=" + age +
                        '}';
    }
}

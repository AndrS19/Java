package com.company.Task7;

public class Task7 {
    public static void main(String[] args) {
        Person person1 = new Person("Alex","Jm",15,"alexjm@gmail.com");
        Person person2 = new Person("Andriy","Sh",19,"andrshd@gmail.com");

        System.out.println("person1 hashcode = " + person1.hashCode());
        System.out.println("person2 hashcode = " + person2.hashCode());
        System.out.println("Перевірка рівності між person1 і person2 = " + person1.equals(person2));
    }
}
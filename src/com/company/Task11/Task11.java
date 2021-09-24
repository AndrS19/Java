package com.company.Task11;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
        private static List<Driver> addDriver(final Driver driver){
            final List<Driver> driverList = new ArrayList<>();
            driverList.add (driver);
            return driverList;
        }
        private static List<Order> addOrder(final Order order){
            final List<Order> driverList = new ArrayList<> ();
            driverList.add (order);
            return driverList;
        }
        public static void main(final String[] args) {

            final Driver driver1 = new Driver ("Andriy","Jonson",21,+38065);
            final Driver driver2 = new Driver ("Roman","Rodriguez",35,+38073);
            final Driver driver3 = new Driver ("Mika","Jams",25,+38965);
            addDriver (driver1);

            final Car car1 = new Car(3415,"Mercedes","Black", addDriver (driver3) );
            final Car car2 = new Car(1919,"BMW","White",  addDriver (driver2));


            final Order order1 = new Order (1,121,5,"Готівка",car1);
            final Order order2 = new Order (2,75.75,4,"Готівка",car2);

            final Client client1 = new Client ("Ricardo","Mister",34,+388881,addOrder (order1));
            final Client client2 = new Client ("Sergio","Otto",23, +380010,addOrder (order2));

            System.out.println ("Taxi 1: "+ client1);
            System.out.println ("================================================================================================" +
                    "=====================================================");
            System.out.println ("Taxi 2: "+ client2);
    }
}

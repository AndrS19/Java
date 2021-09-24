package com.company.Task10;

public class Task11 {
    public static void main(final String[] args) {
        final int n=7;
        final Period [] days = new Period[n];

        days[0] = new Period (Day.Monday,TypeWeather.Sunny,25.3,750,64);
        days[1] = new Period (Day.Tuesday,TypeWeather.Cold,7.7,850,74);
        days[2] = new Period (Day.Wednesday,TypeWeather.Warm,15.8,550,68);
        days[3] = new Period (Day.Thursday,TypeWeather.Rainy,10.3,550,54);
        days[4] = new Period (Day.Friday,TypeWeather.Warm,16.9,400,34);
        days[5] = new Period (Day.Saturday,TypeWeather.Cold,1.0,750,68);
        days[6] = new Period (Day.Sunday,TypeWeather.Sunny,24.8,550,84);
        printWeatherCalendar (days);
    }
    private static void printWeatherCalendar(final Period [] days){
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}

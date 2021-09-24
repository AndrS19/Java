package com.company.Task2;

public class Task2 {

    public static void main(String[] args) {

        String string = "The grass is always greener on the other side of the hill";
        char x = 'o';
        int count = 0;

        for(int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == x)
                count++;
        }

        System.out.println(string);
        System.out.println("Кількість символів \""+x+"\" : " + count);
    }
}
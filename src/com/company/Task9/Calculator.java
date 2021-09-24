package com.company.Task9;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        CustomDouble n1 = new CustomDouble(num1);
        CustomDouble n2 = new CustomDouble(num2);
        char operation = getOperation();
        double result = calc(num1,num2,operation);
        System.out.println("Результат операції: " +result );
    }
    public static double getDouble(){
        System.out.println("Введіть число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Ви допустили помилку при введенні числа. Спробуйте ще раз.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введіть операцію(+,-,*,/):");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ви допустили помилку при введенні операції. Спробуйте ще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операцію не розпізнано. Повторіть введення.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
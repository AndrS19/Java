package com.company.Task8;

public class Task8 {
    public static void main(String[] args) {
        CustomDouble customDouble1 = new CustomDouble(7, 19.9);
        CustomDouble customDouble2 = new CustomDouble(3, 3.5);

        System.out.println("Число 1: " + customDouble1);
        System.out.println("Число 2: " + customDouble2);
        customDouble1.comparisons(customDouble2);
        System.out.println("Сума = " + customDouble1.sum(customDouble2));
        System.out.println("Різниця = " + customDouble1.subtraction(customDouble2));
        System.out.println("Числа рівні?  " + customDouble1.equals(customDouble2));
        System.out.println("Number1 hashcode: " + customDouble1.hashCode());
        System.out.println("Number2 hashcode: " + customDouble2.hashCode());
    }
}

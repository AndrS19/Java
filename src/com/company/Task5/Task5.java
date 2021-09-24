package com.company.Task5;

public class Task5 {

    public static void main(String[] args)
    {
        int[][] matrixA = {
                {-9,1,0},
                {4,1,1},
                {-2,2,-1}
        };
        System.out.println("Матриця A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", matrixA[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {
                int temp = matrixA[i][j];
                matrixA[i][j] = matrixA[j][i];
                matrixA[j][i] = temp;
            }
        }
        System.out.println("------------------------");
        System.out.println("Транспонована матриця A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", matrixA[i][j]);
            }
            System.out.println();
        }
    }
}
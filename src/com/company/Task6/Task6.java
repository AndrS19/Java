package com.company.Task6;

public class Task6 {

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
        int[][] matrixB = {
                {5,3,1},
                {2,4,6},
                {-1,-2,-3}
        };
        System.out.println("--------------");
        System.out.println("Матриця B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", matrixB[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("Множення матриць A і B:");
        int[][] matrixC = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int k = 0; k < 3; k++)
                {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%5d", matrixC[i][j]);
            }
            System.out.println();
        }
    }
}
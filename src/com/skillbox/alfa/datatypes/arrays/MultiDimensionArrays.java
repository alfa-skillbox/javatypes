package com.skillbox.alfa.datatypes.arrays;

import java.util.Arrays;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        {
            int[][] matrix = new int[5][4];
            matrix[2][2] = 5;
            System.out.println("Содержимое массива intsArray: " + Arrays.toString(matrix));
            for (int i = 0; i < matrix.length; i++) {
                System.out.println("В переменной с индексом: " + i + " содержится: " + Arrays.toString(matrix[i]));
            }
        }

        {
            Frog[][] frogsArray = new Frog[4][3];
            frogsArray[3][2] = new Frog();
            System.out.println("Содержимое массива frogsArray: " + Arrays.toString(frogsArray));
            for (int i = 0; i < frogsArray.length; i++) {
                System.out.println("В переменной с индексом: " + i + " содержится: " + Arrays.toString(frogsArray[i]));
            }
        }

        {
            int[][] stepDimensionsArray = new int[][] {{1, 2, 3}, {4, 5}, {6}};
            System.out.println("Содержимое массива stepDimensionsArray: " + Arrays.toString(stepDimensionsArray));
            for (int i = 0; i < stepDimensionsArray.length; i++) {
                System.out.println("В переменной с индексом: " + i + " содержится: " + Arrays.toString(stepDimensionsArray[i]));
            }
        }
    }
}
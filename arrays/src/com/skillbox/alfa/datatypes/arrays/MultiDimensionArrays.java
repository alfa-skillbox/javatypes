package com.skillbox.alfa.datatypes.arrays;

import java.util.Arrays;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        {
            int[][] intMatrix = new int[5][4];
            intMatrix[2][2] = 5;
            System.out.println("Содержимое массива intMatrix: " + Arrays.toString(intMatrix));
            for (int i = 0; i < intMatrix.length; i++) {
                System.out.println("В переменной с индексом: " + i + " содержится: " + Arrays.toString(intMatrix[i]));
            }
        }

        {
            A[][] objectMatrix = new A[4][3];
            objectMatrix[3][2] = new A();
            System.out.println("Содержимое массива objectMatrix: " + Arrays.toString(objectMatrix));
            for (int i = 0; i < objectMatrix.length; i++) {
                System.out.println("В переменной с индексом: " + i + " содержится: " + Arrays.toString(objectMatrix[i]));
            }
        }

//        {
//            int[][] stepDimensionsArray = new int[][] {{1, 2, 3}, {4, 5}, {6}};
//            System.out.println("Содержимое массива stepDimensionsArray: " + Arrays.toString(stepDimensionsArray));
//            for (int i = 0; i < stepDimensionsArray.length; i++) {
//                System.out.println("В переменной с индексом: " + i + " содержится массив " + stepDimensionsArray[i] +
//                        " : " + Arrays.toString(stepDimensionsArray[i]));
//            }
//        }
    }
}
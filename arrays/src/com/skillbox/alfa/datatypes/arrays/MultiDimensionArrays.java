package com.skillbox.alfa.datatypes.arrays;

import java.util.Arrays;

public class MultiDimensionArrays {
    public static void main(String[] args) {

        // ПРИМЕР массива массивов примитивов, у которого заданы не все размерности
        int[][] arrayOfPrimitiveArrays = new int[5][];
        arrayOfPrimitiveArrays[2] = new int[3];
        arrayOfPrimitiveArrays[2][2] = 5;
        System.out.println("Содержимое массива arrayOfPrimitiveArrays: " + Arrays.toString(arrayOfPrimitiveArrays));
        for (int i = 0; i < arrayOfPrimitiveArrays.length; i++) {
            System.out.println("В переменной с индексом: " + i + " содержится: " + Arrays.toString(arrayOfPrimitiveArrays[i]));
        }

        // ПРИМЕР массива массивов объектов, у которого заданы все размерности
        A[][] arrayOfObjectArrays = new A[4][3];
        arrayOfObjectArrays[3][2] = new A();
        System.out.println("Содержимое массива arrayOfObjectArrays: " + Arrays.toString(arrayOfObjectArrays));
        for (int i = 0; i < arrayOfObjectArrays.length; i++) {
            System.out.println("В переменной с индексом: " + i + " содержится: " + Arrays.toString(arrayOfObjectArrays[i]));
        }

        // ПРИМЕР явная инициализация массива массивов
        int[][] explicitArrayOfArrays = new int[][] {{1, 2, 3}, {4, 5}, {6}};
        System.out.println("Содержимое массива explicitArrayOfArrays: " + Arrays.toString(explicitArrayOfArrays));
        for (int i = 0; i < explicitArrayOfArrays.length; i++) {
            System.out.println("В переменной с индексом: " + i + " содержится массив " + explicitArrayOfArrays[i] +
                    " : " + Arrays.toString(explicitArrayOfArrays[i]));
        }
    }
}
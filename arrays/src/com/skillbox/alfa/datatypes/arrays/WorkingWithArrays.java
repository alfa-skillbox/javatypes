package com.skillbox.alfa.datatypes.arrays;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {

        int[] intsArray = new int[5];
        intsArray[1] = 10;
        int a = 1;
        int b = 2;
        intsArray[a + b] = a + b;

        int n = intsArray[b + a] + intsArray[b - a];
        System.out.println("Значение n: " + n);


        System.out.println("Содержимое массива intsArray: " + Arrays.toString(intsArray));

        Frog[] frogsArray = new Frog[25];
        for (int i = 0; i < frogsArray.length; i++) {
            frogsArray[i] = new Frog();
            frogsArray[i].xPosition = i + 2;
            System.out.println("Лягушка с индексом " + i + " имеет позицию " + frogsArray[i].xPosition);
        }
    }
}


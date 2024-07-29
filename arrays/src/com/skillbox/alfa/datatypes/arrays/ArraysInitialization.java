package com.skillbox.alfa.datatypes.arrays;

import java.util.Arrays;

public class ArraysInitialization {
    public static void main(String[] args) {
        {
            // ПРИМЕР начальные значения для массивов примитивных типов
            byte[] bytesArray = new byte[5];
            short[] shortsArray = new short[5];
            char[] charsArray = new char[5];
            int[] intsArray = new int[5];
            long[] longsArray = new long[5];
            float[] floatsArray = new float[5];
            double[] doublesArray = new double[5];
            boolean[] booleansArray = new boolean[5];

            // ПРИМЕР начальные значения для массивов ссылочных типов
            A[] objects = new A[5];

            System.out.println("Содержимое массива bytesArray: " + Arrays.toString(bytesArray));
            System.out.println("Содержимое массива shortsArray: " + Arrays.toString(shortsArray));
            System.out.println("Содержимое массива charsArray: " + Arrays.toString(charsArray));
            System.out.println("Содержимое массива intsArray: " + Arrays.toString(intsArray));
            System.out.println("Содержимое массива longsArray: " + Arrays.toString(longsArray));
            System.out.println("Содержимое массива floatsArray: " + Arrays.toString(floatsArray));
            System.out.println("Содержимое массива doublesArray: " + Arrays.toString(doublesArray));
            System.out.println("Содержимое массива booleansArray: " + Arrays.toString(booleansArray));

            System.out.println("Содержимое массива objects: " + Arrays.toString(objects));

            // ПРИМЕР явной инициализации массивов
//            short[] shortArray = new short[]{1, 2, 3, 4, 5};
//            A[] objects2 = new A[]{new A(), new A()};
//
//            System.out.println("Содержимое массива shortArray: " + Arrays.toString(shortArray));
//            System.out.println("Содержимое массива objects2: " + Arrays.toString(objects2));
        }
    }
}
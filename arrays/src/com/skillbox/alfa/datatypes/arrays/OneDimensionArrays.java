package com.skillbox.alfa.datatypes.arrays;

import java.util.Arrays;

public class OneDimensionArrays {
    public static void main(String[] args) {
        /*{
            // начальные значения для примитивных и объектных массивов
            byte[] bytesArray = new byte[5];
            short[] shortsArray = new short[5];
            char[] charsArray = new char[5];
            int[] intsArray = new int[5];
            long[] longsArray = new long[5];
            float[] floatsArray = new float[5];
            double[] doublesArray = new double[5];
            boolean[] booleansArray = new boolean[5];

            com.skillbox.alfa.datatypes.arrays.Frog[] frogsArray = new com.skillbox.alfa.datatypes.arrays.Frog[5];

            System.out.println("Содержимое массива bytesArray: " + Arrays.toString(bytesArray));
            System.out.println("Содержимое массива shortsArray: " + Arrays.toString(shortsArray));
            System.out.println("Содержимое массива charsArray: " + Arrays.toString(charsArray));

            System.out.println("Первый символ в ASCII таблице '\\0' в виде символа " + '\0'
                    + ", в виде числа " + (int) '\0');

            System.out.println("Содержимое массива intsArray: " + Arrays.toString(intsArray));
            System.out.println("Содержимое массива longsArray: " + Arrays.toString(longsArray));
            System.out.println("Содержимое массива floatsArray: " + Arrays.toString(floatsArray));
            System.out.println("Содержимое массива doublesArray: " + Arrays.toString(doublesArray));
            System.out.println("Содержимое массива booleansArray: " + Arrays.toString(booleansArray));

            System.out.println("Содержимое массива frogsArray: " + Arrays.toString(frogsArray));
        }*/

        /*{
            com.skillbox.alfa.datatypes.arrays.Frog[] javaStyleFrogsArray = new com.skillbox.alfa.datatypes.arrays.Frog[] {new com.skillbox.alfa.datatypes.arrays.Frog(), new com.skillbox.alfa.datatypes.arrays.Frog()};
            com.skillbox.alfa.datatypes.arrays.Frog вотТакМогуFrogsArray[] = new com.skillbox.alfa.datatypes.arrays.Frog[] {new com.skillbox.alfa.datatypes.arrays.Frog(), new com.skillbox.alfa.datatypes.arrays.Frog()};
            com.skillbox.alfa.datatypes.arrays.Frog иТакСойдётFrogsArray [] = new com.skillbox.alfa.datatypes.arrays.Frog[] {new com.skillbox.alfa.datatypes.arrays.Frog(), new com.skillbox.alfa.datatypes.arrays.Frog()};
            com.skillbox.alfa.datatypes.arrays.Frog [] пустьБудетFrogsArray = new com.skillbox.alfa.datatypes.arrays.Frog[] {new com.skillbox.alfa.datatypes.arrays.Frog(), new com.skillbox.alfa.datatypes.arrays.Frog()};

            System.out.println("Содержимое массива javaStyleFrogsArray: " + Arrays.toString(javaStyleFrogsArray));
            System.out.println("Содержимое массива вотТакМогуFrogsArray: " + Arrays.toString(вотТакМогуFrogsArray));
            System.out.println("Содержимое массива иТакСойдётFrogsArray: " + Arrays.toString(иТакСойдётFrogsArray));
            System.out.println("Содержимое массива пустьБудетFrogsArray: " + Arrays.toString(пустьБудетFrogsArray));
        }*/

        /*{
            com.skillbox.alfa.datatypes.arrays.Frog[] frogsArray1 = new com.skillbox.alfa.datatypes.arrays.Frog[] {new com.skillbox.alfa.datatypes.arrays.Frog(), new com.skillbox.alfa.datatypes.arrays.Frog(), new com.skillbox.alfa.datatypes.arrays.Frog()};
            com.skillbox.alfa.datatypes.arrays.Frog[] frogsArray2 = new com.skillbox.alfa.datatypes.arrays.Frog[] {new com.skillbox.alfa.datatypes.arrays.Frog()};
            System.out.println("Содержимое массива frogsArray1: " + Arrays.toString(frogsArray1));
            System.out.println("Содержимое массива frogsArray2: " + Arrays.toString(frogsArray2));

            frogsArray2 = frogsArray1;
            System.out.println("Содержимое массива frogsArray2: " + Arrays.toString(frogsArray2));
        }*/
    }
}

class Frog {
    public int xPosition = 0;
    public int yPosition = 0;
    public boolean isAlive = true;
}
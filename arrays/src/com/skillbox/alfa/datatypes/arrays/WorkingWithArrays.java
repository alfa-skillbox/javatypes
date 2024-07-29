package com.skillbox.alfa.datatypes.arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        // входной массив данных
        int[] inputArray = new int[]{5, 6, 7, 8, 9, 12, 23, 11, 4, 2, 18, 32, 45, 34, 101, 7, 9, 10};
        int threshold = 3; // пороговое значение
        boolean notValid = false; // признак нашли или нет значение меньше порога
        int notValidIndex = -1; // здесь будет храниться индекс элемента со значением ниже порога
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < threshold) {
                notValid = true;
                notValidIndex = i;
            }
        }
        if (notValid) {
            System.out.println("В массиве inputArray длиной: " + inputArray.length
                    + " встречается элемент меньше threshold: " + threshold + ", он имеет позицию " + (notValidIndex + 1));
        } else {
            System.out.println("В массиве inputArray длиной: " + inputArray.length
                    + " нет элемента меньше threshold: " + threshold);
        }
    }
}


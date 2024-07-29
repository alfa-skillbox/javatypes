package com.skillbox.alfa.datatypes.arrays;

import java.util.Arrays;

public class WorkingWithIndexes {
    public static void main(String[] args) {

        int[] intsArray = new int[5];

        // ПРИМЕР записи в элемент массива примитивов
        intsArray[1] = 10;
        int a = 1;
        int b = 2;
        intsArray[a + b] = a * b + 5; // равнозначно intsArray[3] = 7;
        System.out.println("Содержимое массива intsArray: " + Arrays.toString(intsArray));

        // ПРИМЕР обращения к элементу массива примитивов
        int n = intsArray[a + b] + intsArray[1]; // равнозначно int n = intsArray[3] + intsArray[1];
        System.out.println("Значение n: " + n);

        // ПРИМЕР обращения к элементу по индексу за пределами длины массива
        /* Ошибки компиляции не будет. Компилятор не проверяет индексы
        Ошибка этапа выполнения программы - "Индекс за пределами массива" */
//        System.out.println("Сейчас будет сообщение, что индекс 5 находится за пределами длины массива");
//        int s = intsArray[5]; // 6-го элемента нет в массиве
    }
}


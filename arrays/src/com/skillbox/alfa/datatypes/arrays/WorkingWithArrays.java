package com.skillbox.alfa.datatypes.arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        // данные о возрастах сотрудников из зарплатной ведомости
        int[] ages = new int[]{34, 46, 73, 17, 19, 33, 23, 57, 49, 28, 25, 25, 45, 34, 39, 58, 60, 21, 45, 65, 36, 2};
        // необходимо проверить, что в наборе возрастов нет сотрудников младше 18 лет
        // 1. Взять следующий индекс массива, пока индекс не пройдет все элементы массива
        // 2. Если число меньше 18, то вывести сообщение о провале валидации
        // 3. Если нет, то вернуться к п.1
        for (int index = 0; index < ages.length; index = index + 1) {
//            код, который хотите повторять
            if(ages[index] < 18) {
                System.out.println("Валидация провалена!!!");
            }
        }
//        for (int i = 1; i <=10; i = i + 1) {
//            System.out.println("i= " + i);
//        }
    }
}


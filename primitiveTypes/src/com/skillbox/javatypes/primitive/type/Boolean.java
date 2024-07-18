package com.skillbox.javatypes.primitive.type;

public class Boolean {
    // Тип предназначенный для хранения только двух значений: true и false

    public static void main(String[] args) {

        int i = 7;
        double d = 10.3;
        boolean b = i > d;

        // Пример использования boolean с оператором if-else
        if (b) {
            System.out.println("Результат, если b = true");
        } else {
            System.out.println("Результат, если b = false");
        }

        // Пример использования boolean с тернарным оператором
        System.out.println("Результат тернарной операции 'b ? истина : ложь' = " + (b ? "истина" : "ложь"));
    }

}

package com.skillbox.javatypes.reference;

public class Step4_WorkingWithReferenceVariables {
    public static void main(String[] args) {
        System.out.println("Создание frog1 и frog2");
        Frog frog1 = new Frog(); // Зеленая лягушка
        Frog frog2 = new Frog(); // Красная лягушка
        System.out.println("Зеленая frog1: " + frog1);
        System.out.println("Красная frog2: " + frog2);
        frog1 = frog2; // обе переменные теперь указывают на Красную лягушку
        System.out.println("После операции frog1 = frog2;");
        System.out.println("Бывшая Зеленая frog1: " + frog1);
        System.out.println("Красная frog2: " + frog2);

//        Frog frog3 = null;
//        Frog frog4 = new Frog();
//        System.out.println("Создание frog3 и frog4");
//        System.out.println("frog3: " + frog3);
//        System.out.println("frog4: " + frog4);
//        frog4 = null; // обе переменные теперь указывают на null
//        System.out.println("После операции frog4 = null;");
//        System.out.println("frog3: " + frog3);
//        System.out.println("frog4: " + frog4);
//
//        if (frog4 == null) {
//            System.out.println("Пример проверки ссылки на null в условных операторах");
//        }
    }
}
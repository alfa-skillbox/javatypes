package com.skillbox.javatypes.primitive.intro;

public class PrimitiveInitialisation {

    public static void main(String[] args) {

        // ПРИМЕР НЕ проинициализированной примитивной переменной
        int notInitializedVariable;
        // не скомпилируется
//        System.out.println("Значение примитивной переменной notInitializedVariable = " + notInitializedVariable);


        // ПРИМЕР инициализации при объявлении
        char ch = 'T';
        System.out.println("Инициализация при объявлении. Значение переменной ch = " + ch + "\n\n");


        // ПРИМЕР отложенной инициализации
        System.out.println("Объявляем переменную: double d;");
        double d;

        // выполнили какие-либо действия в программе, не связанные с d
        System.out.println("Выполняем какие-то действия в программе");

        // инициализировали примитивную переменную d
        System.out.println("Инициализируем переменную d рассчетным значением d = 5.5 + 10.2;");
        d = 5.5 + 10.2;

        // теперь можно использовать
        System.out.println("Используем переменную d = " + d);

    }
}
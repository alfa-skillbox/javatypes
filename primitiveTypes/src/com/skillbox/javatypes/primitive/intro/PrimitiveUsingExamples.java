package com.skillbox.javatypes.primitive.intro;

public class PrimitiveUsingExamples {

    public static void main(String[] args) {
        // Пример с примитивной переменной для счетчика
        int counter;
        counter = 0;
        // когда обращаемся к примитивной переменной в выражении, то получаем сохраненное в ней значение
        System.out.println("Значение счетчика counter = " + counter);
        counter = 1;
        System.out.println("Значение счетчика counter = " + counter);
        counter = 2;
        System.out.println("Значение счетчика counter = " + counter + "\n\n");

        // Пример с запоминанием значения в переменной и использоанием в этого значения в будущем
        double d;
        // запомнили в d результат вычисления
        d = 5.5 + 10.2;
        System.out.println("Положили что-то в d");
        // выполнили какие-либо действия в программе
        System.out.println("Выполняем какие-то действия в программе");
        // снова воспользовались результатами рассчета
        System.out.println("Используем переменную d = " + d);

    }
}
package com.skillbox.javatypes.primitive;

public class Main {

    public static void main(String[] args) {
        // описание примитивных переменных
        {
            int counter;
            counter = 0;
            // когда обращаемся к примитивной переменной в выражении, то получаем сохраненное в ней значение
            System.out.println("Значение счетчика counter = " + counter);
            counter = 1;
            System.out.println("Значение счетчика counter = " + counter);
            counter = 2;
            System.out.println("Значение счетчика counter = " + counter);

            double d;
            // запомнили в f результат вычисления
            d = 5.5 + 10.2;
            System.out.println("Значение переменной d = " + d);
            // выполнили какие-либо действия в программе
            System.out.println("Какие-то действия в программе");
            // снова воспользовались результатами рассчета
            double dd;
            dd = d;
            System.out.println("Значение переменной dd = " + dd);

        }
        // определение примитивных переменных
        {
            byte bt = -1;
            short s = 10;
            char ch = 'f';
            int i = 1024;
            long l = 2048L;
            float f = 5.5f;
            double d = 36.6;
            boolean b = true;
        }

        {

        }

        System.out.println("");
    }
}
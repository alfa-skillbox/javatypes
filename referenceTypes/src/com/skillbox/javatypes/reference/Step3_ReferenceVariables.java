package com.skillbox.javatypes.reference;

public class Step3_ReferenceVariables {
    public static void main(String[] args) {
        // объявление переменной класса Frog
        Frog frog;
        // System.out.println("Теперь frog = " + frog);
        // выполнили какие-либо действия в программе
        System.out.println("Выполняем какие-то действия в программе");
        // присвоили переменную созданному объекту
        frog = new Frog();
        System.out.println("Теперь frog = " + frog);

        frog = new Frog();
        System.out.println("Теперь frog = " + frog);
    }
}

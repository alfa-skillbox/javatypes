package com.skillbox.javatypes.reference;

public class Step2_ObjectCreation {
    public static void main(String[] args) {
        // можете создать из класса Frog множество объектов этого класса
        new Frog();
        new Frog();
        new Frog();
        new Frog();
        new Frog();

        // использование созданного через new объекта. Это два разных объекта new Frog()
        int x = new Frog().xPosition + 5;
        boolean y = new Frog().isAlive && true;
    }
}

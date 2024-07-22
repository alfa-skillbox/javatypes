package com.skillbox.javatypes.reference;

public class GameEngine {
    public static void main(String[] args) {
        Frog frog = new Frog();
        int newPosition = 5;
        // перемещение вправо по клеткам игрового поля
        frog.moveLeft(newPosition);
        System.out.println("Новая позиция лягушки: " + frog.xPosition);
    }
}
package com.skillbox.alfa.datatypes.memory;

public class SnakeGame {

    public static void main(String[] args) {
        Frog frog = new Frog();
        int newPosition = 5;
        // перемещение лягушки влево по клеткам игрового поля
        frog.moveLeft(newPosition);
        System.out.println("Новая позиция лягушки: " + frog.xPosition);
    }
}
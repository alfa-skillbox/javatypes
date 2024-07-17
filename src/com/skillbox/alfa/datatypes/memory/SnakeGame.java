package com.skillbox.alfa.datatypes.memory;

public class SnakeGame {

    public static void main(String[] args) {
        Frog frog = new Frog();
        int newPosition = 5;
        // перемещение вправо по клеткам игрового поля
        frog.moveLeft(newPosition);
        System.out.println("Новая позиция лягушки: " + frog.xPosition);
    }
}

class Frog {
    public int xPosition = 0;
    public int yPosition = 0;
    public boolean isAlive = true;

    public void moveLeft(int position) {
        xPosition = position;
    }
}
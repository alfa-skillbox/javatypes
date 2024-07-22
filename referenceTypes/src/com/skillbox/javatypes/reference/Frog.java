package com.skillbox.javatypes.reference;

class Frog {
    // поля класса отвечают за состояние объекта
    public int xPosition;
    public int yPosition;
    public boolean isAlive = true;

    // методы класса отвечают за взаимодействие всей программы с этим объектом
    public void moveLeft(int offset) {
        int currentPosition = xPosition;
        if (offset > 0) {
            xPosition = currentPosition - offset;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void moveUp(int offset) {
        int resultOffset = 0;
        if (offset > 0) {
            resultOffset = offset;
        }
        yPosition = resultOffset;
    }
}

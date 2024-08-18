package com.skillbox.alfa.datatypes.memory;

class Frog {
    public int xPosition;
    public int yPosition;
    public boolean isAlive = true;

    public void moveLeft(int offset) {
        // текущая позиция лягушки на поле
        int currentPosition = xPosition;
        if (offset > 0) {
            // смещаем лягушку влево на offset
            xPosition = currentPosition - offset;
        }

    }

    public boolean isAlive() {
        return isAlive;
    }

    public void moveUp(int offset) {
        if (offset > 0) {
            yPosition = yPosition - offset;
        }
    }
}

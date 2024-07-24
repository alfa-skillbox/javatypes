package com.skillbox.alfa.datatypes.memory;

class Frog {
    public int xPosition;
    public int yPosition;
    public boolean isAlive = true;

    public void moveLeft(int offset) {
        if (offset > 0) {
            xPosition = xPosition - offset; // смещает лягущку влево от текущего положения на offset
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

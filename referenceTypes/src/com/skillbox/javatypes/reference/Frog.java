package com.skillbox.javatypes.reference;

class Frog {
    // ------------------------ Состояние объекта описываются полями класса --------------
    int xPosition; // положение на игровом поле по горизонтали
    int yPosition; // положение на игровом поле по вертикали
    boolean isAlive = true; // признак жива или не жива

    // ------------------------ Действия описываются методами класса --------------
    // метод 1
    // offset - количество шагов
    void moveLeft(int offset) {
        int currentPosition = xPosition; // текущая позиция лягушки на поле
        if (offset > 0) {
            xPosition = currentPosition - offset; // новая позиция лягушки на поле запоминается
        }
    }

    // метод 2
    boolean isAlive() {
        return isAlive;
    }

    // метод 3
    void moveUp(int offset) {
        if (offset > 0) {
            yPosition = yPosition - offset;
        }
    }
}

package com.skillbox.javatypes.primitive.type;

public class Char {
    // char используется для работы с одиночными символами - ‘a’, ‘@’, ‘0’ и тп.
    // char - Character

    public static void main(String[] args) {
        char ch1 = 'I'; // кавычки одинарные, т.к. это символ, а не строка!
        char ch2 = 73;
        char ch3 = 'A' + 10; // аналогично как 65 + 10 = 75 = 'K'
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

}

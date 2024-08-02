package com.skillbox.javatypes.primitive.type;

public class Int {
    //
    public static void main(String[] args) {
        int i = 2147483647; // максимальное целое число типа int

        // переполнение разрядной сетки как оно есть
        int iPlusOne = i + 1;
        System.out.println("i = " + i); // i в десятичном виде
        System.out.println("i в двоичном виде = " + Integer.toBinaryString(i) + " = 01...1 (31 единица)"); // i в двоичном виде
        System.out.println("iPlusOne = " + iPlusOne); // в десятичном виде
        System.out.println("iPlusOne в двоичном виде = " + Integer.toBinaryString(iPlusOne) + " = 10...0 (31 нулей)"); // iPlusOne в двоичном виде

    }
}

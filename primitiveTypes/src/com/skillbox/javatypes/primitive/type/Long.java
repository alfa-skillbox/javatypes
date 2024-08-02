package com.skillbox.javatypes.primitive.type;

public class Long {
    // Тип long полезен в случаях, когда тип int недостаточно велик для хранения желаемого значения

    public static void main(String[] args) {
        // применять L или l, если число выходит за пределы диапазона int
        long longMax = 9_223_372_036_854_775_807L;
        long longMax2 = 9_223_372_036_854_775_807l;

        // допустимо
        long l = 123_456; // число внутри диапазона int от -2147483648 до 2147483647
        int iMax = 2_147_483_647;
        int iMin = -2147483648;
        l = iMax;
        l = iMin;

        System.out.println("longMax = " + longMax); // в десятичном виде
        System.out.println("longMax в двоичном виде = " + java.lang.Long.toBinaryString(longMax) + " 8 байт = 64 бита"); // в двоичном виде
        System.out.println("lMax2 = " + longMax2); // в десятичном виде
        System.out.println("longMax2 в двоичном виде = " + java.lang.Long.toBinaryString(longMax2) + " 8 байт = 64 бита"); // в двоичном виде
        System.out.println("l = " + l); // в десятичном виде
        System.out.println("l в двоичном виде = " + java.lang.Long.toBinaryString(l) + " 8 байт = 64 бита"); // в двоичном виде
    }
}

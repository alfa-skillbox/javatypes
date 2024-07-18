package com.skillbox.javatypes.primitive.type;

public class Long {
    // Тип long полезен в случаях, когда тип int недостаточно велик для хранения желаемого значения

    public static void main(String[] args) {
        // не скомпилируется
//        int i = 9_223_372_036_854_775_807;

        // применять L или l, если число выходит за пределы диапазона int
        long lMax = 9_223_372_036_854_775_807L;
        long lMax2 = 9_223_372_036_854_775_807l;

        // допустимо
        long l = 123_456;

        System.out.println("lMax = " + lMax);
        System.out.println("lMax2 = " + lMax2);
        System.out.println("l = " + l);
    }
}

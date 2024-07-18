package com.skillbox.javatypes.primitive.type;

public class Byte {
    // Переменные типа byte часто используют при работе с данными из файлов или сети
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = 127;

        // не скомпилируется
//        byte b3 = b1 + b2;
        // не скомпилируется
//        short s1 = b1 + b2;
        int i = b1 + b2;

        // принудительное приведение типов
        short s2 = (short) (b1 + b2);
        System.out.println(s2);

        // к int приводить не надо, JVM сама это сделает
        int i2 = (int) (b1 + b2);

    }
}

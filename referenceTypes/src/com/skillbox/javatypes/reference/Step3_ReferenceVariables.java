package com.skillbox.javatypes.reference;

public class Step3_ReferenceVariables {
    public static void main(String[] args) {
        // Связывание переменной с объектом
        Frog frog; // Объявляете переменную: Имя_класса имя_переменной;
        frog = new Frog(); // Cоздаете объект и сразу связываете его с переменной через присваивание
        System.out.println("frog = " + frog);

        // ПРИМЕР отложенной инициализации переменной
        // Объявляете переменную: Имя_класса имя_переменной;
        Frog frog2;
//        System.out.println("Теперь frog2 = " + frog2);
        System.out.println("Выполняем какие-то действия в программе");
        frog2 = new Frog(); // когда понадобилось, создаете объект и присваиваете переменной
        System.out.println("frog2 = " + frog2);

        // ПРИМЕР инициализации переменной сразу при ее объявлении
        Frog frog3 = new Frog();
        System.out.println("frog3 = " + frog3);
    }
}

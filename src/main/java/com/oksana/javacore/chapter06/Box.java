package main.java.com.oksana.javacore.chapter06;

public class Box {
    double width;
    double height;
    double depth;

/*    //вывести объем параллелепипеда - BoxDemo3.java
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }*/

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

/*    //установить размеры параллелепипеда - BoxDemo5.java
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }*/

/*    //Это конструктор класса Box - BoxDemo6.java
    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }*/


    //Параметризированный конструктор класса Box
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

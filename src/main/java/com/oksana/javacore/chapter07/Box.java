package main.java.com.oksana.javacore.chapter07;

public class Box {
    double width;
    double height;
    double depth;

    //Внимание на этот конструктор - в нем используется в качестве параметра объект типа Box
    Box(Box ob) { //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор класса Box, используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор класса Box, используемый, когда ни один из размеров не указан
    Box() {
        width = -1;  // использовать значение -1 для обозначения
        height = -1; // неинициализированного
        depth = -1;  // параллелепипеда
    }

    //конструктор класса Box, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

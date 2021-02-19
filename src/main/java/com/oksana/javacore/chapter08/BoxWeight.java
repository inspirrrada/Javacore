package main.java.com.oksana.javacore.chapter08;

public class BoxWeight extends Box {
    double weight; //вес параллелепипеда

/*    //конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
 */

    //конструктор, применяемый при указании всех параметров
    //ининциализировать поля width, height и depth с помощью метода super()
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); //вызвать конструктор суперкласса
        weight = m;
    }

    //сконструировать клон объекта
    BoxWeight(BoxWeight ob) { //передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    //конструктор, применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }

    //конструктор, применяемый при создании куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

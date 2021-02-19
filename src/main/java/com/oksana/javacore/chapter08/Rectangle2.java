package main.java.com.oksana.javacore.chapter08;

public class Rectangle2 extends  Figure2 {
    Rectangle2(double a, double b) {
        super(a, b);
    }

    //переопределить метод area() для четырехугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

package main.java.com.oksana.javacore.chapter08;

public class Rectangle extends Figure{
    Rectangle(double a, double b) {
        super(a, b);
    }

    //переопределить метод area() для четырехугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

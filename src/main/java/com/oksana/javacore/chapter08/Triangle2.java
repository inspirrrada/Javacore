package main.java.com.oksana.javacore.chapter08;

public class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a,b);
    }

    //переопределить метод area() для прямоугольного треугольника
    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}

package main.java.com.oksana.javacore.chapter08;

public class AbstractAreas {
    public static void main(String[] args) {
        //Figure2 f = new Figure2(10,10); //недопустимо
        Rectangle2 r = new Rectangle2(9,5);
        Triangle2 t = new Triangle2(10,8);
        Figure2 figref; // верно, но объект не создается

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());

    }
}

package main.java.com.oksana.javacore.chapter08;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setip(10,12);

//        subOb.sum2(); //нарушение правил доступа переменной р из класса А
        System.out.println("Сумма равна " + subOb.total);
    }
}

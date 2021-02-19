package main.java.com.oksana.javacore.chapter08;

public class Override {
    public static void main(String[] args) {
        B3 subOb = new B3(1,2,3);
//        subOb.show(); //здесь вызывается метод show() из класса B
        subOb.show("Это k: "); //вызвать метод show() из класса B
        subOb.show();               //вызвать метод SHOW() из класса A
    }
}

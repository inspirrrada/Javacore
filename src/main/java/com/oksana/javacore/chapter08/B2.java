package main.java.com.oksana.javacore.chapter08;

public class B2 extends A{
    int i; //этот член i скрывает член i из класса А

    B2(int a, int b) {
        super.i = a; //член i из класса А
        i = b;       //член i из класса В
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

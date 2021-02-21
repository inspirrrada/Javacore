package main.java.com.oksana.javacore.chapter09.p2;

import main.java.com.oksana.javacore.chapter09.A;
import main.java.com.oksana.javacore.chapter09.B;

public class NestedIFDemo {
    public static void main(String[] args) {
        //использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10)) {
            System.out.println("Число 10 неотрицательное");
        }

        if (nif.isNotNegative(-12)) {
            System.out.println("Это не будет выведено");
        }
    }
}

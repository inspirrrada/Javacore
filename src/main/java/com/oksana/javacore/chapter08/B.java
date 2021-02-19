package main.java.com.oksana.javacore.chapter08;

public class B extends A {
    int k;
    int total;

    void showk() {
        System.out.println("k:" + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }

/*    void sum2() {
        total = i + p; // ОШИБКА: член p в этом классе недоступен
    }*/


}

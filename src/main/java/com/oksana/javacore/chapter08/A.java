package main.java.com.oksana.javacore.chapter08;

public class A {
    int i, j;       //этот член открыт по умолчанию,
    private int p;  //а этот член закрыт в классе A

    void showj() {
        System.out.println("i и j: " + i + " " + j);
    }

    void setip(int x, int y) {
        i = x;
        p = y;
    }
}


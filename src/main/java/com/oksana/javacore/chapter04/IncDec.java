package main.java.com.oksana.javacore.chapter04;

public class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b; //c = 3, b = 3
        d = a++; //d = 1, a = 2;
        c++;     //c = 4

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}

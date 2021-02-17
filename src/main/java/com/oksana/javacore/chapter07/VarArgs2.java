package main.java.com.oksana.javacore.chapter07;

public class VarArgs2 {
    public static void main(String[] args) {
        vaTest("Один параметр переменной длины: " ,10);
        vaTest("Три параметра переменной длины: " ,1, 2, 3);
        vaTest("Один параметр переменной длины: ");
    }

    static void vaTest(String msg, int...v) {
        System.out.println(msg + v.length + " Содержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}

package main.java.com.oksana.javacore.chapter07;

public class VarArgs {
    public static void main(String[] args) {
        vaTest(10); // 1 аргумент
        vaTest(1, 2, 3); // 3 аргумента
        vaTest(); // без аргументов
    }

    static void vaTest(int...v) {
        System.out.println("Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}

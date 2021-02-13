package main.java.com.oksana.javacore.chapter05;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                break; //выход из цикла, если значение переменной i равно 10
            }
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");

        //----------------------------------------
        int i = 0;
        while (i < 100) {
            if (i == 10) {
                break; //выход из цикла, если значение переменной i равно 10
            }
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл завершен.");

        //----------------------------------------
        for (int k = 0; k < 3; k++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break; //выход из цикла, значение переменной j расно 10
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}

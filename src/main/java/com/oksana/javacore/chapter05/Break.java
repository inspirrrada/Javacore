package main.java.com.oksana.javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Предшествует оператору break.");
                    if (t) {
                        break second; // выход из блока second
                    }
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор нследует за блоком second.");
        }

        //----------------------------------------------------------
        //Применение оператора break для выхода из вложенных циклов
        outer: for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outer; // выход из обоих циклов
                }
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет выводиться");
        }
        System.out.println("Циклы завершены.");


        //-------------------------------------------------
        //Эта программа содержит ошибку
        one: for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + ": ");
        }

        for (int j = 0; j < 100; j++) {
            if (j == 10) {
 //               break one; // ОШИБКА!
            }
            System.out.println(j + " ");
        }
    }
}

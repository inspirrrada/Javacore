package main.java.com.oksana.javacore.chapter02;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        //адресатом этого оператора цикла служит блок кода
        for (x = 0; x < 10; x++) {
            System.out.println("Значение х: " + x);
            System.out.println("Значение y: " + y);
            y = y - 2;
        }
    }
}

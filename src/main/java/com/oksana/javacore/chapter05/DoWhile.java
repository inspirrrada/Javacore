package main.java.com.oksana.javacore.chapter05;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);

        //цикл в более эффективной форме
        n = 10;
        do {
            System.out.println("такт2 " + n);
        } while (--n > 0);
    }
}

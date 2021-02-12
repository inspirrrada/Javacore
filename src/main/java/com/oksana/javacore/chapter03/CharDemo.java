package main.java.com.oksana.javacore.chapter03;

public class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2, ch3;

        ch1 = 88; // код символа X
        ch2 = 'Y';

        System.out.print("ch1 и ch2: ");
        System.out.println(ch1 + " " + ch2);

        ch3 = 'X';
        System.out.println("ch3 содержит " + ch3);

        ch3++; // увеличить на единицу значение переменной ch3
        System.out.println("ch3 теперь содержит " + ch3);
    }
}

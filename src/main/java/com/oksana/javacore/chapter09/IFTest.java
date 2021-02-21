package main.java.com.oksana.javacore.chapter09;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        //разместить числа в стеке
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }

        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }

        //извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack2.pop());
        }
    }
}

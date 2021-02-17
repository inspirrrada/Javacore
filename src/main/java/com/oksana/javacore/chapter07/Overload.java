package main.java.com.oksana.javacore.chapter07;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        //double result;
        int i = 88;

        //вызвать все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10,20);

        /*result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);*/

        ob.test(i); //здесь вызывается вариант методп test(double)
        ob.test(123.2); //здесь вызывается вариант метода test(double)

    }
}

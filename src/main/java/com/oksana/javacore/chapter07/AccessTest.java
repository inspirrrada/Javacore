package main.java.com.oksana.javacore.chapter07;

public class AccessTest {
    public static void main(String[] args) {
        Test2 ob = new Test2();

        //Эти операторы правильны, поэтому члены a и b данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        //Этот оператор неверен и может вызвать ошибку
        // ob.c = 100; // ОШИБКА!

        //Доступ к члену с данного класса должен осуществляться с помощью методов ее класса
        ob.setc(100); //ВЕРНО!
        System.out.println("a, b, и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}

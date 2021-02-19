package main.java.com.oksana.javacore.chapter08;

public class Dispatch {
    public static void main(String[] args) {
        A4 a = new A4(); //объект класса A4
        B4 b = new B4(); //объект класса B4
        C4 c = new C4(); //объект класса C4

        A4 r;            //получить ссылку на объект типа А4

        r = a;           //переменная r ссылается на объект типа А4
        r.callme();      //вызвать вариант метода callme(), определенный в классе A4

        r = b;          //переменная r ссылается на объект типа B4
        r.callme();     //вызвать вариант метода callme(), определенный в классе B4

        r = c;          //переменная r ссылается на объект типа C4
        r.callme();     //вызвать вариант метода callme(), определенный в классе C4
    }
}

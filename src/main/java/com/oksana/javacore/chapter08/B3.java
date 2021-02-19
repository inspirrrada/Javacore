package main.java.com.oksana.javacore.chapter08;

public class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

/*    //вывести содержимое переменной k с помощью метода, переопределяющего метод show() из класса A
    void show() {
        super.show();
        System.out.println("k: " + k);
    }*/

    //перегрузить метод show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

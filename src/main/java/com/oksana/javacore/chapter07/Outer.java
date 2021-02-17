package main.java.com.oksana.javacore.chapter07;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //это внутренний класс
    class Inner {
        int y = 10; // y - локальная переменная класса Inner

        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }

/*    void showy() {
        System.out.println(y); //ошибка, здесь переменная y недоступна!
    }*/

}

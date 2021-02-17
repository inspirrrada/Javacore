package main.java.com.oksana.javacore.chapter07;

public class Test2 {
    int a;         //доступ по умолчанию
    public int b;  //открытый доступ
    private int c; //закрытый доступ

    //методы доступа к члену с данного класса
    void setc(int i) { // установить значение члена с данного класса
        c = i;
    }

    int getc() { //получить значение члена с данного класса
        return c;
    }
}

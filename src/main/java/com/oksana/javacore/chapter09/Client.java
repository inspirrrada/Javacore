package main.java.com.oksana.javacore.chapter09;

public class Client implements CallBack {
    //реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, могут определяться и другие члены.");
    }
}

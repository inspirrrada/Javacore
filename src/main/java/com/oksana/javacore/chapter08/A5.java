package main.java.com.oksana.javacore.chapter08;

public abstract class A5 {
    abstract void callme();

    //абстрактные классы все же могут содержать конкретные методы
    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

package main.java.com.oksana.javacore.chapter09.p1;

public class Demo {
    //получить экземпляры различных классов из пакета p1
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}

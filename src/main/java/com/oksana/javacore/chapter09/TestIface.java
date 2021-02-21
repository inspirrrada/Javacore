package main.java.com.oksana.javacore.chapter09;

public class TestIface {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}

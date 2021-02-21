package main.java.com.oksana.javacore.chapter09;

//реализует вложенный интерфейс
public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

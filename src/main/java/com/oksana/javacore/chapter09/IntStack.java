package main.java.com.oksana.javacore.chapter09;

public interface IntStack {
    void push(int item); //сохранить элемент в стеке
    int pop();           //извлечь элемент из стека

    default  void clear() {
        System.out.println("Метод clear() не реализован.");
    }
}

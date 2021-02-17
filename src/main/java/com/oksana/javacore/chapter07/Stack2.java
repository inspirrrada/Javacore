package main.java.com.oksana.javacore.chapter07;

public class Stack2 {
    /* переменные stck и tos закрытые, то есть они не могут быть случайно или намеренно изменены таким образом, чтобы нарушить стек
     */
    private int stck[] = new int[10];
    private int tos;

    //выделить память под стек и инициализировать его
    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Разместить элемент в стеке
    void push(int item) {
        if (tos == stck.length-1) { //использован член длины массива
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    //Извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

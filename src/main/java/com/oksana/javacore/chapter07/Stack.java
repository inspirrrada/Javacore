package main.java.com.oksana.javacore.chapter07;

//целочисленный стек, который может содержать 10 значений
public class Stack {
    /* переменные stck и tos закрытые, то есть они не могут быть случайно или намеренно изменены таким образом, чтобы нарушить стек
     */
    private int stck[] = new int[10];
    private int tos;

    //инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    //Разместить элемент в стеке
    void push(int item) {
        if (tos == 9) {
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

package main.java.com.oksana.javacore.chapter09;

public interface MyIF {
    //это объявление обычного метода в интерфейсе
    //Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

    //А это объявление метода по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";
    }

    //Это объявление статического метода в интерфейсе
    static int getDefaultNumber() {
        return 0;
    }
}

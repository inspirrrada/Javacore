package main.java.com.oksana.javacore.chapter09;

public class MyIFImp implements MyIF {
    //в этом классе должен быть реализован только метод getNumber(),
    //а вызов метода getString() разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}

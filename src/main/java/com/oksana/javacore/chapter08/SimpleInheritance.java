package main.java.com.oksana.javacore.chapter08;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //суперкласс может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showj();
        System.out.println();

        // Подкласс имеет доступ ко всем открытым членам своего суперкласса
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showj();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j, и k в объекте subOb:");
        subOb.sum();
    }
}

package main.java.com.oksana.javacore.chapter07;

public class OverloadCoans {
    public static void main(String[] args) {
        //создать параллелепипеды, используя разыные конструкторы
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        //создать копию объекта mybox1
        Box myclone = new Box(mybox1);

        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("Объем равен " + vol);

        //получить объем клона
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);
    }
}

package main.java.com.oksana.javacore.chapter09.p2;

public class Protection2 extends main.java.com.oksana.javacore.chapter09.p1.Protection{
    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");

        //доступно только для данного класса или пакета
        //System.out.println("n = " + n);

        //доступно только для данного класса
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);


    }
}

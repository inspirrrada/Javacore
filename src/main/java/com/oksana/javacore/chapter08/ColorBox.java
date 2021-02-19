package main.java.com.oksana.javacore.chapter08;

public class ColorBox extends Box {
    int color; //цвет параллелепипеда

    ColorBox(double w, double h, double d, int c) {
/*        width = w;
        height = h;
        depth = d;*/
        super(w,h,d);
        color = c;
    }
}

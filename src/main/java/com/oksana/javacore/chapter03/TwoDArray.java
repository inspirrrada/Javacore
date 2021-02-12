package main.java.com.oksana.javacore.chapter03;

public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        //Резервирование памяти вручную для массива с разной размерностью второго измерения
        int twoD2[][] = new int[4][];
        twoD2[0] = new int[1];
        twoD2[1] = new int[2];
        twoD2[2] = new int[3];
        twoD2[3] = new int[4];

        int i2, j2, k2 = 0;

        for (i2 = 0; i2 < 4; i2++) {
            for (j2 = 0; j2 < i2 + 1; j2++) {
                twoD2[i2][j2] = k2;
                k2++;
            }
        }

        for (i2 = 0; i2 < 4; i2++) {
            for (j2 = 0; j2 < i2 + 1; j2++) {
                System.out.print(twoD2[i2][j2] + " ");
            }
            System.out.println();
        }

        //Инициализировать двухмерный массив
        double m[][] = {
                { 0*0, 1*0, 2*0, 3*0 },
                { 0*1, 1*1, 2*1, 3*1 },
                { 0*2, 1*2, 2*2, 3*2 },
                { 0*3, 1*3, 2*3, 3*3 }
        };

        int i3, j3;

        for (i3 = 0; i3 < 4; i3++) {
            for (j3 = 0; j3 < 4; j3++) {
                System.out.print(m[i3][j3] + " ");
            }
            System.out.println();
        }
    }
}

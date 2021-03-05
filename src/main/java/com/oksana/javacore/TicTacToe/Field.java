package main.java.com.oksana.javacore.TicTacToe;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Field {
    private final char[] TABLE = new char[9];

    //конструктор для инициализации таблицы
    Field() {
        for (int i = 0; i < TABLE.length; i++) {
            TABLE[i] = ' ';
        }
    }

    public char[] getTABLE() {
        return TABLE;
    }
}
package main.java.com.oksana.javacore.TicTacToe;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Field {
    char markPlayer;
    char markX = 'X', mark0 = '0', markEmpty = ' ';

    int numEntered = 0;
    int score;

    boolean movePerson = true;
    boolean isTableFull = false;

    char[] table = new char[9];
    int tableScore[] = new int[9];

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //методы работы с таблицей: инициализация и отображение
    void beginTable() {
        for (int i = 0; i < table.length; i++) {
            table[i] = markEmpty;
        }
    }

    void displayTable() {
        System.out.println("     |     |     ");

        for (int i = 0; i < table.length; i++) {
            System.out.print(" " + " ");
            System.out.print(table[i] + " ");
//--------------------------------------------------
            if ( (i+1) % 3 == 0 && (i+1) != 9 ) {
                System.out.println();
                System.out.println("_____|_____|_____");
                System.out.println("     |     |     ");
            } else if ( (i+1) == 9 ) {
                System.out.println("");
                System.out.println("     |     |     ");
            } else {
                System.out.print(" |");
            }
//---------------------------------------------------
        }

    }

    void displayTableExample() {
        int tableExample[] = new int[9];

        System.out.println("     |     |     ");

        for (int i = 0; i < tableExample.length; i++) {

            tableExample[i] = i+1;

            System.out.print(" " + " ");
            System.out.print(tableExample[i] + " ");
//-----------------------------------------------------
            if ( (i+1) % 3 == 0 && (i+1) != 9 ) {
                System.out.println();
                System.out.println("_____|_____|_____");
                System.out.println("     |     |     ");
            } else if ( (i+1) == 9 ) {
                System.out.println("");
                System.out.println("     |     |     ");
            } else {
                System.out.print(" |");
            }
//-----------------------------------------------------
        }

    }

    //тестовый метод для проверки работы подсчета очков
    void displayTableScore() {
        System.out.println("     |     |     ");

        for (int i = 0; i < tableScore.length; i++) {

            System.out.print(" " + " ");
            System.out.print(tableScore[i] + " ");

            if ( (i+1) % 3 == 0 && (i+1) != 9 ) {
                System.out.println();
                System.out.println("_____|_____|_____");
                System.out.println("     |     |     ");
            } else if ( (i+1) == 9 ) {
                System.out.println("");
                System.out.println("     |     |     ");
            } else {
                System.out.print(" |");
            }
        }
    }

}
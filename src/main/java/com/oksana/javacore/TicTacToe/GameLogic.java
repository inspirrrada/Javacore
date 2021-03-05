package main.java.com.oksana.javacore.TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameLogic extends Field {
    private char markPlayer;
    private char markX = 'X', mark0 = '0', markEmpty = ' ';

    private int numEntered = 0;
    private int score;

    private boolean movePerson = true;
    private boolean isTableFull = false;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private int tableScore[] = new int[9];

    private Field field;

    //отобразить правила игры
    void gameRules() {
        final String RULE_STRING_1 = "Let's play Tic Tac Toe game!";
        final String RULE_STRING_2 = "==> You are X, the computer is 0. Players take turns putting their marks in empty squares.";
        final String RULE_STRING_3 = "==> For choosing need cell, just enter its number from 1 to 9, according to the table below.";
        final String RULE_STRING_4 = "==> The first player to get 3 of his marks in a row (up, down, across, or diagonally) is the winner.";
        final String RULE_STRING_5 = "==> When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.";
        final String RULE_STRING_6 = "Let's start!";

        System.out.println();
        System.out.println(RULE_STRING_1);
        System.out.println();
        System.out.println(RULE_STRING_2);
        System.out.println(RULE_STRING_3);

        displayTableExample();

        System.out.println(RULE_STRING_4);
        System.out.println(RULE_STRING_5);
        System.out.println();
        System.out.println(RULE_STRING_6);
        System.out.println();
    }

    //отобразить игровую таблицу
    void displayTable() {
        System.out.println("     |     |     ");

        for (int i = 0; i < getTABLE().length; i++) {
            System.out.print(" " + " ");
            System.out.print(getTABLE()[i] + " ");
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

    //отобразить пример таблицы
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

    //записать ход в таблицу
    void recordMoveToTable() {
        if (getTABLE()[numEntered-1] == markEmpty) {
            switch (numEntered) {
                case 1:
                    getTABLE()[0] = markPlayer;
                    tableScore[0] = score;
                    break;
                case 2:
                    getTABLE()[1] = markPlayer;
                    tableScore[1] = score;
                    break;
                case 3:
                    getTABLE()[2] = markPlayer;
                    tableScore[2] = score;
                    break;
                case 4:
                    getTABLE()[3] = markPlayer;
                    tableScore[3] = score;
                    break;
                case 5:
                    getTABLE()[4] = markPlayer;
                    tableScore[4] = score;
                    break;
                case 6:
                    getTABLE()[5] = markPlayer;
                    tableScore[5] = score;
                    break;
                case 7:
                    getTABLE()[6] = markPlayer;
                    tableScore[6] = score;
                    break;
                case 8:
                    getTABLE()[7] = markPlayer;
                    tableScore[7] = score;
                    break;
                case 9:
                    getTABLE()[8] = markPlayer;
                    tableScore[8] = score;
                    break;
            }
        }
    }

    //проверка на выигрыш
    char winCheck() {
        int sumHoriz1 = tableScore[0] + tableScore[1] + tableScore[2];
        int sumHoriz2 = tableScore[3] + tableScore[4] + tableScore[5];
        int sumHoriz3 = tableScore[6] + tableScore[7] + tableScore[8];

        int sumVert1 = tableScore[0] + tableScore[3] + tableScore[6];
        int sumVert2 = tableScore[1] + tableScore[4] + tableScore[7];
        int sumVert3 = tableScore[2] + tableScore[5] + tableScore[8];

        int sumDiag1 = tableScore[0] + tableScore[4] + tableScore[8];
        int sumDiag2 = tableScore[2] + tableScore[4] + tableScore[6];

        if (    sumHoriz1 == 6 || sumHoriz2 == 6 || sumHoriz3 == 6
                || sumVert1 == 6 || sumVert2 == 6 || sumVert3 == 6
                || sumDiag1 == 6 || sumDiag2 == 6 ) {
            return markX;
        } else if (    sumHoriz1 == 21 || sumHoriz2 == 21 || sumHoriz3 == 21
                || sumVert1 == 21 || sumVert2 == 21 || sumVert3 == 21
                || sumDiag1 == 21 || sumDiag2 == 21 ) {
            return mark0;
        }

        return markEmpty;
    }

    //проверка таблицы на заполнение (ничья)
    boolean checkTableFull() {
        for (int i = 0; i < getTABLE().length; i++) {
            //если находит пустую ячейку, значит таблица не переполнена - выход из цикла
            if (getTABLE()[i] == markEmpty) {
                isTableFull = false;
                break;
            //если пустой ячейки нет, значит таблица переполнена - конец игры
            } else {
                isTableFull = true;
            }
        }

        return isTableFull;
    }

    //процесс игры
    void game() throws IOException {

        //игра работает, пока таблица не заполнена
        while (!checkTableFull()) {
            System.out.println("Now it's your turn. Make a move");

//-----------ход игрока
            if (movePerson) {
                int numByPerson;
                do {
                    do {
                        numByPerson = Integer.parseInt(reader.readLine());
                        if (numByPerson > 9) {
                            System.out.println("Enter a valid number!");
                        }
                    } while (numByPerson > 9);

                    if (getTABLE()[numByPerson-1] != markEmpty) {
                        System.out.println("Enter number of free cell!");
                    }
                } while (getTABLE()[numByPerson-1] != markEmpty);


                numEntered = numByPerson;
                markPlayer = 'X';
                score = 2;

                recordMoveToTable();
                displayTable();

                if (winCheck() == markX) {
                    System.out.println("CONGRATULATIONS!!! YOU WON!");
                    break;
                } else {
                    movePerson = false;
                }

                if (checkTableFull() == true) {
                    System.out.println("GAME ENDED IN A TIE, ALL CELLS ARE FULL.");
                }
            }
//-----------ход компьютера
            else {
                Random random = new Random();

                int numByPC;

                do {
                    numByPC = random.nextInt(9) + 1;
                } while (getTABLE()[numByPC-1] != markEmpty);


                numEntered = numByPC;
                markPlayer = '0';
                score = 7;

                recordMoveToTable();
                displayTable();

                if (winCheck() == mark0) {
                    System.out.println("GAME IS OVER!!! YOU LOSE!");
                    break;
                } else {
                    movePerson = true;
                }


                if (checkTableFull() == true) {
                    System.out.println("ALL CELLS ARE FULL, GAME ENDED IN A TIE.");
                }

            }
        }
    }

    //запуск игры
    void start() throws IOException {
        field = new Field(); //тут сработает конструктор на создание массива из 9 элементов
        gameRules();
        game();
    }
}

package main.java.com.oksana.javacore.TicTacToe;

import java.io.IOException;
import java.util.Random;

public class GameLogic extends Field {
    Field field = new Field();

    //отобразить правила игры
    void gameRules() {
        System.out.println();
        System.out.println("Let's play Tic Tac Toe game!");
        System.out.println();
        System.out.println("==> You are X, the computer is 0. Players take turns putting their marks in empty squares.");
        System.out.println("==> For choosing need cell, just enter its number from 1 to 9, according to the table below.");

        field.displayTableExample();

        System.out.println("==> The first player to get 3 of his marks in a row (up, down, across, or diagonally) is the winner.");
        System.out.println("==> When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.");
        System.out.println();
        System.out.println("Let's start!");
        System.out.println();
    }

    //записать ход в таблицу
    void recordMoveToTable() {
        if (table[numEntered-1] == markEmpty) {
            switch (numEntered) {
                case 1:
                    table[0] = markPlayer;
                    tableScore[0] = score;
                    break;
                case 2:
                    table[1] = markPlayer;
                    tableScore[1] = score;
                    break;
                case 3:
                    table[2] = markPlayer;
                    tableScore[2] = score;
                    break;
                case 4:
                    table[3] = markPlayer;
                    tableScore[3] = score;
                    break;
                case 5:
                    table[4] = markPlayer;
                    tableScore[4] = score;
                    break;
                case 6:
                    table[5] = markPlayer;
                    tableScore[5] = score;
                    break;
                case 7:
                    table[6] = markPlayer;
                    tableScore[6] = score;
                    break;
                case 8:
                    table[7] = markPlayer;
                    tableScore[7] = score;
                    break;
                case 9:
                    table[8] = markPlayer;
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
        for (int i = 0; i < table.length; i++) {
            //если находит пустую ячейку, значит таблица не переполнена - выход из цикла
            if (table[i] == markEmpty) {
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

                    if (table[numByPerson-1] != markEmpty) {
                        System.out.println("Enter number of free cell!");
                    }
                } while (table[numByPerson-1] != markEmpty);


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
                } while (table[numByPC-1] != markEmpty);


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
}

package main.java.com.oksana.javacore.TicTacToe;

import java.io.IOException;

public class GameRunner {
    public static void main(String[] args) throws IOException {
        //вызов метода с игровой логикой
        GameLogic ticTacToe = new GameLogic();

        ticTacToe.beginTable();
        ticTacToe.gameRules();
        ticTacToe.game();
    }


}

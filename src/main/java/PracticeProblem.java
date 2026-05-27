/**

        * File: Culminating Assignment | Battleship

        * Author: Peter Zheng

        * Date Created: May 26, 2026

        * Date Last Modified: May 26, 2026

        */


// importing javafx, might add more - temp comment
import javafx.application.application;
import javafx.scene.Scene;
import javafx.scene.control.button;
import javafx.scene.layout.gridpane;
import javafx.stage.stage;

import java.util.random;

public class PracticeProblem extends application{


        // Variables
        int SIZE = 5;

        char[][] playerBoard;
        char[][] enemyBoard;

        Button[][] playerButtons;
        Button[][] enemyButtons;

        boolean playerTurn;
        boolean setupMode;

        int shipsPlaced;

        Random rand;
        Label title;
        GridPane grid;

        //starts javafx
	public static void main(String args[]) {

                launch(args);
	}

        // Start (Game Setup)
        @Override
        public void start(Stage stage){

        playerBoard = new char[SIZE][SIZE];
        enemyBoard = new char[SIZE][SIZE];

        playerButtons = new Button[SIZE][SIZE];
        enermyButtons = new Button[SIZE][SIZE];

        rand = new Random();

        setupMode = true;
        playerTurn = true;

        shipsPlaced = 0;
        }

}

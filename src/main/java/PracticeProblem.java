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

        //------- Start (Game Setup)-------
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

        initializeBoards();
        
        grid = createGrid();

        title = new Label("Place 2 Ships (Length 2) on the left grid");
        title.setFont(new Font(16));

        Button restartButn = new Button("Restart game");
        restartButn.setOnAction(e -> restartGame()); 
        // -> Lambda operator, used for nameless functions, takes input and does action

        VBox root = new VBox(title, grid, restartButn);
        
        //javafx scenes/title
        Scene scene = new Scene(root, 600, 380);
        stage.setScene(scene);
        stage.setTitle("BattleShip");
        stage.show();

        placeEnemyShips();
        }

        //------- Methods-------
        public void restartGame(){
                setupMode = true;
                playerTurn = true;
                shipsPlaced = 0;

                playerBoard = new char[SIZE][SIZE];
                enemyBoard = new char[SIZE][SIZE];

                initializeBoards();

                //resets text on buttons &  colors & styles (i.e: removes green, red, and blue)
                for (int r = 0; r < SIZE; r++){
                        for (int c = 0; c < SIZE; c++){
                                playerButtons[r][c].setText("");
                                playerButtons[r][c].setStyle("");

                                enemyButtons[r][c].setText("");
                                enemyButtons[r][c].setStyle("");

                                //enables clicking again - removes clicking after you won so must be reset
                                playerButtons[r][c].setDisable(false);
                        }       enemyButtons[r][c].setDisable(false);
                }

                        title.setText("Place 2 ships (Length 2) on left grid");

                        placeEnemyShips();
        }

        
                //------- Initialize-------
                public void initializeBoards(){
                        for (int r = 0; r < SIZE; r++){
                                for (int c = 0; c < SIZE; c++){
                                        playerBoard[r][c] = '~';
                                        enemyBoard[r][c] = '~';
                                }
                        }
                }
        
        
        
}

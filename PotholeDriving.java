/*
 * Fei Z
 */

import java.util.Scanner;
import java.util.Random;

public class PotholeDriving {

//Itentifies characters used
    public static final int BOARD_SIZE = 10; 
    public static final char EMPTY = '_';
    public static final char PATH = '_';
    public static final char PLAYER = 'X';
    public static final char POTHOLE = '_';
    public static final char GOAL = '^';

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        Random r = new Random();

//Creates the 2D Environment 

Boolean game = true;

do{
        char [][] board = new char[BOARD_SIZE][BOARD_SIZE];
        int [][] logic = new int[BOARD_SIZE][BOARD_SIZE];

        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length; j++){
                board[i][j] = EMPTY; 
            }
        }

        for (int i=0; i<board.length; i++){
            for (int j=0; j <board[i].length; j++){
                logic[i][j] = 0; 
            }
        }

        int numPot = 0;
                
        while (numPot < 5){
        int hY= r.nextInt(BOARD_SIZE);
        int hX = r.nextInt(BOARD_SIZE);

        if ( logic[hY][hX] != 1){
            if((hY != 0 && hX != 0)&&( hY != 9 && hX != 9)){
            logic [hY][hX] = 1;
            board [hY][hX] = POTHOLE;
            numPot ++;
            }
        }
        }

        int pX = 0;
        int pY = 0;
        board[pY][pX] = PLAYER;

        int gX = 9;
        int gY = 9;
        board[gY][gX] = GOAL; 
    
        

        System.out.println("Welcome to Pothole Driving! Get home while avoiding potholes!");

        boolean gameOn = true; 

//Display the Game
        while(game){
            for (int i=0; i<board.length; i++){
                for (int j=0; j<board[i].length; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }        

//Accepts user Input and returns display
        System.out.println("Enter either -1, 0, or 1 to move in the x or 9 to quit");
        int dX = Keyboard.nextInt();

        if (dX == 9){
            gameOn = false;
            System.out.println("Goodbye!");
            System.exit(0);
        }

        System.out.println("Enter either -1, 0, or 1 to move in the y or 9 to quit");
        int dY = Keyboard.nextInt();
        
        if (dY == 9){
            gameOn = false;
            System.out.println("Goodbye!");
            System.exit(0);
        }

//Validates user input
        if (dY < -1 || dY > 1){
            System.out.println("That is invalid!");
            dY = 0;
        }


        if (dX < -1 || dX > 1){
            System.out.println("That is invalid!");
            dX = 0;
        }
        
        board[pY][pX] = PATH; 
        pX += dX;
        pY += dY; 

//Limits player in area
        if(pX < 0){
            pX =0;
        }
        else if(pX > BOARD_SIZE-1){
            pX = BOARD_SIZE - 1;
        }

        if(pY < 0){
            pY =0;
        }        
        else if(pY > BOARD_SIZE-1){
            pY = BOARD_SIZE - 1;
        }      

//Declares win or lose
        if(logic[pY][pX] == 1){
            System.out.println("OH NO! POTHOLE!");
            break;
        }

        else if(pX == gX && pY == gY){
            System.out.println("You got home! You won!");
            break;
        }

        else{
        board[pY][pX] = PLAYER;
        }

        } //while loop

        
    System.out.println("Do you want to play again? Enter \"true\" or \"false\"");

    game = Keyboard.nextBoolean();


    }while(game);
    System.exit(0);


    }
}

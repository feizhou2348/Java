/*
 * Fei Zhou
 */
import java.util.Scanner;
public class MatrixAdder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to Matrix Adder program!");

//Creates the first matix

        System.out.println("Please enter the length and width of the first matrix ");   

        Integer lengtha = keyboard.nextInt();
        keyboard.nextLine();

        Integer widtha = keyboard.nextInt();
        keyboard.nextLine();

        int a[][] = new int[lengtha][widtha];

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.println("Enter value at index "+i+" "+j);
                a[i][j] = keyboard.nextInt();
            }
        }

 //Creates the sencond matrix

        System.out.println("Please enter the length and width of the second matrix ");   
        
        Integer lengthb = keyboard.nextInt();
        keyboard.nextLine();

        Integer widthb = keyboard.nextInt();
        keyboard.nextLine();

        int b[][] = new int[lengthb][widthb];

        for (int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                System.out.println("Enter value at index "+i+" "+j);
                b[i][j] = keyboard.nextInt();
            }
        }

        System.out.println();

//Checks for matrix lengths and widths
        if(lengtha != lengthb | widtha != widthb){
            System.out.println("Invalid Dimensions. These cannot be added.");
            System.exit(0);
        }

//Prints out the first matrix
        else{
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("+");

//Prints out the second matrix

        for (int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }        

        System.out.println("=");

//Prints out the resulting matrix

        for (int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                System.out.print((b[i][j]+a[i][j])+" ");
            }
            System.out.println();
        }       

    }
    }
}


    


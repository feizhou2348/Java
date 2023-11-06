/*
 * Fei Z
 */

 import java.util.Scanner;
 public class TriangleMaker{

    public static void main(String[] args){

//Obtaining user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Greetings! Enter a positive, non-zero integer and I will print a triangle of that size!");
        
        int size = keyboard.nextInt();
        keyboard.nextLine();

//Validating user input to be positive, non-zero integer
        if(size <=0 || size % 1 != 0){
            System.out.println("Invalid size!");
            System.exit(0);
        }

//Upper-part of triangle
        for(int row=1; row<=size; row++){

            for(int col=1; col<=row; col++){

                System.out.print("*");
            
                }

            System.out.println();
            
        }
//Lower-part of triangle
        for(int row=1; row<=(size-1); row++){

             for(int col=row; col<=(size-1); col++){

                System.out.print("*");
                    
                }

                System.out.println();
                    
                }
//Informing user of completion
        System.out.println("Done :)");
        System.exit(0);

    






    }

 }

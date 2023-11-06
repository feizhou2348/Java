/*
 * Fei Z
 */

import java.util.Scanner;
public class CoffeeTester {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Coffee House!");
        Boolean exit = false;

        while (exit == false){
//Creates first coffee
        System.out.println("what is the name of the first coffee?");
            String n1 = keyboard.nextLine();
        System.out.println("what is the cafffeine content?");
            Double cc1 = keyboard.nextDouble();
            keyboard.nextLine();
        Coffee c1 = new Coffee(n1,cc1);
//creates second coffee
        System.out.println("\nwhat is the name of the second coffee?");
            String n2 = keyboard.nextLine();
        System.out.println("what is the cafffeine content?");
            Double cc2 = keyboard.nextDouble();
            keyboard.nextLine();
        Coffee c2 = new Coffee(n2,cc2);
//prints risky amount
        System.out.println(c1.risky(c1));
        System.out.println(c2.risky(c2));

		System.out.println("Do the first and second coffes have same properties? "+(c1.equals(c2)));

		System.out.println("Do you want to exit the program? Enter true or false");
            exit = keyboard.nextBoolean();
            keyboard.nextLine();
        }
        
    }

}

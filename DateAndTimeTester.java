/*
 * Fei Z
 */
import java.util.Scanner;

public class DateAndTimeTester {

private int month, day, hour, minuet;
private boolean isValidDate, isValidTime;


    public void printInstruction(){
        System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid!");
    }

//Extract elements from string
    public int getMonth(String input){
        month = Integer.parseInt(input.substring(0,input.indexOf("/")));
        return month;
        }

    public int getDay(String input){
        day = Integer.parseInt(input.substring(input.indexOf("/")+1,input.indexOf(" ")));
        return day;
        }
    
    public int getHour(String input){
        hour = Integer.parseInt(input.substring(input.indexOf(" ")+1,input.indexOf(":")));
        return hour;
        }

    public int getMinuet(String input){
        minuet = Integer.parseInt(input.substring(input.indexOf(":")+1,10));
        return minuet;
        }

//validating date    
    public boolean isValidDate (int month, int day) {

        if(month ==1){
            return day >0 && day <=31;
        }
        else if(month ==2){
            return day >0 && day <=28;
        }
        else if(month ==3){
            return day >0 && day <=31;
        }
        else if(month ==4){
            return day >0 && day <=30;
        }
        else if(month ==5){
            return day >0 && day <=31;
        }
        else if(month ==6){
            return day >0 && day <=30;
        }
        else if(month ==7){
            return day >0 && day <=31;
        }
        else if(month ==8){
            return day >0 && day <=31;
        }
        else if(month ==9){
            return day >0 && day <=30;
        }
        else if(month ==10){
            return day >0 && day <=31;
        }
        else if(month ==11){
            return day >0 && day <=30;
        }
        else if(month ==12){
            return day >0 && day <=31;
        }
        else{
            return false;
        }

    }

//validating time    
    public boolean isValidTime(int hour, int minuet){
        return hour > 0 && hour <= 12 && minuet >=0 && minuet <60;
    }

//validates date and time    
    public boolean isValid(boolean isValidDate, boolean isValidTime){
        
        return(isValidDate(month, day)) && (isValidTime(hour, minuet));
    }


//run methods
    public void run(){

        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        while (quit == false){
        printInstruction();

        String input = keyboard.nextLine();

        month = getMonth(input);
        day = getDay(input);
        hour = getHour(input);
        minuet = getMinuet(input);

        isValidDate = isValidDate(month, day);
        isValidTime = isValidDate(hour, minuet);

        if (isValid(isValidDate, isValidTime)){
            System.out.println("The date and time is valid");
        }
        else {
            System.out.println("The date and time is not valid");
        }

        System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue");
        String exit = keyboard.nextLine();
        if (exit.equalsIgnoreCase("quit")){
            quit = true;
        }
        }

    }
    
}

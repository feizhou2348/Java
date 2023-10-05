/*
 * Fei Zhou
 */
import java.util.Scanner;
public class RectangleSorter { 

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


//Prompts user to finalize aray size
        System.out.println("Welcome to Rectangle Sorter! Enter the number of rectangles you want to sort!");
        Integer size = keyboard.nextInt();
        while(size<=0){
            System.out.println("That is invalud! Please enter a valid size!");
            size = keyboard.nextInt();
        }

//Creates and populates an array of rectangle sizes
        Double []array = new Double[size];
        Double areaSum = 0.0;

        for (int i=0; i<array.length; i++){
            System.out.println("Please enter the length for Rectangle "+(i+1));
                Double length = keyboard.nextDouble();
                keyboard.nextLine();
            System.out.println("Please enter the width for Rectangle "+(i+1));
                Double width = keyboard.nextDouble();
                keyboard.nextLine();
            Double area = length*width;
            array[i]= area;
            areaSum += array[i];
        }


//Offers options for sorting
        System.out.println("\nHow would you like to sort the areas?\nEnter \"ascending\" or \"descending\"");
        String order = keyboard.nextLine();

        if (order.equalsIgnoreCase("descending")){
            for(int i=0; i<array.length;i++){
                    int largestIndex = i;
                        for (int j=i+1; j<array.length; j++){

                            if (array[j] > array[largestIndex]){
                                largestIndex = j;
                            }

                        }
                        if(largestIndex != i){
                            Double temp = array[i];
                            array[i] = array[largestIndex];
                            array[largestIndex] = temp;
                        }
                }
                System.out.println("\nThe areas of the rectangles in descending order are:");
                for(int i=0; i<array.length; i++){
                    System.out.print(array[i]+" ");
                }
            }

        else{
                for(int i=0; i<array.length;i++){
                        int smallestIndex = i;
                        for (int j=i+1; j<array.length; j++){

                            if (array[j] < array[smallestIndex]){
                                smallestIndex = j;
                            }

                        }
                        if(smallestIndex != i){
                            Double temp = array[i];
                            array[i] = array[smallestIndex];
                            array[smallestIndex] = temp;
                        }
                }
                System.out.println("\nThe areas of the rectangles in ascending order are:");
                for(int i=0; i<array.length; i++){
                    System.out.print(array[i]+" ");
                }
            }

System.out.println("\n");

//Offers to desplay the average area
    System.out.println("\nWould you like to see the average area of the collection?\nEnter \"Y\" or \"N\"");
    String average = keyboard.nextLine();
    if(average.equalsIgnoreCase("y")){
        System.out.println("The average area of the collection is "+(areaSum/size));
    }

//Offers to display the minimum area
    System.out.println("\nWould you like to see the minimum area of the collection?\nEnter \"Y\" or \"N\"");
    String minimum = keyboard.nextLine();
    if(minimum.equalsIgnoreCase("Y")){

        if (order.equalsIgnoreCase("ascending")){
            System.out.println("The minimum area of the collection is "+array[0]);
        }
        else{
            System.out.println("The minimum area of the collection is "+array[size-1]);
        }
    }

//Offers to display the maximum area
    System.out.println("\nWould you like to see the maximum area of the collection?\nEnter \"Y\" or \"N\"");
    String maximum = keyboard.nextLine();
    if(maximum.equalsIgnoreCase("Y")){
        if (order.equalsIgnoreCase("descending")){
                System.out.println("The maximum area of the collection is "+array[0]);
            }
            else{
                System.out.println("The maximum area of the collection is "+array[size-1]);
            }
    }


    }

}
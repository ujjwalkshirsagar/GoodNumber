package com.ujjwal;

import java.util.Scanner;

public class Main {


    public static boolean isGoodNumber(int N) {
    
        //defining varaible
        boolean u;
        //giving the varaible default boolean value
        u = true;

        // Find the last digit
        int digit = N % 10;

        //checking if all the digit in the number N is the same or not

        while (N != 0) {
        
            // Find the current last digit
            int current_digit = N % 10;
            
            // Update the value of N
            N = N / 10;

            // If there is any distinct digit, then return false
            if (current_digit != digit) {
                u = false;
            }
            
        }
        
        //Printing the output on console
        System.out.println(u);
        return u;
    }
    
    
    public static void main(String[] args){
    
        int loop=0;
        
        //Taking input (integers) from users
        Scanner k = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number to check if it is Good number or not : ");
        int num = k.nextInt();
        isGoodNumber(num);

        //infinite while loop which will stop if user decides to exit program
        while (loop<1) {

            //Taking the input if user want to exit or keep using the program
            Scanner end = new Scanner(System.in);  // Create a Scanner object
            System.out.println("To again check if number is Good number or not press Y or press N to exit : ");
            String end1 = end.nextLine();


            switch(end1.charAt(0)){
            
                //Case statements
                
                case 'y':
                    Scanner q = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Number to check if it is Good number or not : ");
                    int num2 = q.nextInt();
                    isGoodNumber(num2);;
                    continue;
                    
                case 'Y':
                    Scanner r = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Number to check if it is Good number or not : ");
                    int num3 = r.nextInt();
                    isGoodNumber(num3);
                    continue;

                case 'n':
                    loop=3; //To exit the program changing loop value to 3 so that infinite while loop will stop
                    break;

                case 'N':
                    loop=3; //To exit the program changing loop value to 3 so that infinite while loop will stop
                    break;

                default:System.out.println("Please enter valid input");
            }

        }

    }
}

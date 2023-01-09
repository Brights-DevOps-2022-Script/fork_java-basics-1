package com.bt.java.basics;
import java.util.Scanner;


/**
 * Read a number from user input and count up to this number using a while loop. 
 * Print the numbers up to this number and then „done“.
 *
 * Count to number: 7
 *
 * 1, 2, 3, 4, 5, 6, 7, done
 */
public class SumSusan {

    public static void main(String[] args) {
        

    // Übung Sum of numbers

      Scanner number = new Scanner(System.in); 
      System.out.println("Enter a number between 1 and 4");  // Get user input

      int input = number.nextInt();  // Read user input
      number.close();

      int i = 0;    // define startpoint i for while loop
      int sum = 0;      // define 
      while (i<= input){            //while schleife:  
        sum = sum +1;
        i++;
      }  
      System.out.println("=" + sum);
      
    }
  }





    



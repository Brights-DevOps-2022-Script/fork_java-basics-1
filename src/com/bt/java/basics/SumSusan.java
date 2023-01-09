package com.bt.java.basics;
import java.util.Scanner;

/* Write a program to calculate the sum for a series of numbers 1, …, n where n is user input. 
 * Example: For input of 5 the sum is: 1 + 2 + 3 + 4 + 5 = 15
*/


public class SumSusan {

    public static void main(String[] args) {
        

    // Übung Sum of numbers
      
      Scanner number = new Scanner(System.in); 
      System.out.println("Enter a number between 1 and 10");  // Get user input

      int input = number.nextInt();  // Read user input
      

      int i = 0;    // define startpoint i for while loop
      int sum = 0;      // define startpoint of sum
      while (i<= input){            //while schleife:  
        sum = sum + i;
        System.out.println(sum);
        i++;
      }  
      System.out.println("=" + sum);

      number.close();
    } 

   
  }





    



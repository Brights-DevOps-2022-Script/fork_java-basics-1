package com.bt.java.basics;

import java.util.Scanner;

/* 
 * Read a number from user input and count up to this number using a while loop. 
 * Print the numbers up to this number and then „done“.
 *
 * Count to number: 7
 *
 * 1, 2, 3, 4, 5, 6, 7, done
 */
 
public class WhileLoopSusan {

    public static void main(String[] args) {
        
     // User input    
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter a number between 1 and 7");  
        
    int zahl = myObj.nextInt();  // Read user input
    

    // while loop
    
    int i = 0;

    while (i <= zahl) {
      System.out.println(i);
      i++;
    }  
    //System.out.println("done");
    }
}

 
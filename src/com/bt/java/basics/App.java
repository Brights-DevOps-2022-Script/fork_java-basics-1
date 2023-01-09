/*package com.bt.java.basics;

import javax.swing.text.FlowView;

public class App {
    
     * Jedes Java-Programm hat eine statische Main-Methode als
     * Einsprungspunkt.
     */
    /*
     * @param args
     * @throws Exception
     *
    public static void main(String[] args) throws Exception {

        // Write a program which prints the following character array with a reverse for loop

        char[] susanArray = {'S', 'U', 'S', 'A', 'N'};
        System.out.println(susanArray);

        for (int i = 0; i < susanArray.length; i++) {
            System.out.println(susanArray[i]);
        }
        
      
    // Aufgabe FizzBuzz

    //int[] nullBisHundert = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 ,12, 100 }; 
    //int x = {1 -100}

    for (int x = 0; x < 100; x++) {
       
        if (x%3 == 0){
            System.out.println("Fizz");
    }   if (x%5 == 0) {
            System.out.println("Buzz");
    }   if ((x%3 == 0) && (x%5 == 0)) {
            System.out.println("FizzBuzz");
    }   else {
            System.out.println(x);
    } 
    }

    // Aufgabe ATM with Switch

    Scanner in = new Scanner(System.in);
    int input = Integer.parseInt(in.nextLine());
    
    switch (input) {
        case 1: 1                   
            System.out.println("Black");
            break;
        case 2: 2
            System.out.println("White");
    }       break;
        case 3: 3 
            System.out.println("Red");
            break;
        case 4: 4    
            System.out.println("Green");
        default:
            System.out.println("This is not a valid entry. Please type a number between 1 and 4");
    
}
    
    
    
    
            /*  iteration over all elements:

    //string[] fruits = {"Kiwi", "Pear", "Cherry"}

    for (fruit: fruits){
        System.out.println("Fruit type: " + fruit);
    }

    }
    }
    */
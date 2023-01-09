package com.bt.java.basics;
public class Fizzbuzz {

private static void fizzbuzz(){
    for(int i = 1; i<= 100; i++){
        if (i % 3 == 0 && i % 5 == 0){
          System.out.println("FizzBuzz");
        }    else if (i % 3 == 0){
            System.out.println("Fizz");
        }    else if (i % 5 == 0) {
            System.out.println("Buzz");
        }    else {
            System.out.println(i);  
        }
    }

}private static void variableTrial(){
    System.out.println("Susan");
    System.out.println(2+4);
}
    
public static void main(String[] args) {
    
    fizzbuzz();
    
    variableTrial();
}
}


package com.samedify.examples;

/*
    Write a method printEqual with 3 parameters of type int. The method should not return anything(void).
    If one of the parameters is less than 0, print text "Invalid Value".
    If all numbers are equal print text "All numbers are equal"
    If all numbers are different print text "All numbers are different".
    Otherwise, print "Neither all are equal or different".
 */

public class EqualNumberPrinter {

    public static void main(String[] args){

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
        printEqual(-1,2,3);

    }

    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber){

        if(firstNumber < 0 || secondNumber < 0 || thirdNumber < 0){
            System.out.println("Invalid Value!");
        }else if(firstNumber == secondNumber && firstNumber == thirdNumber && secondNumber == thirdNumber ){
            System.out.println("All numbers are equal!");
        }else if(firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber){
            System.out.println("All numbers are different!");
        }else{
            System.out.println("Neither all are equal or different");
        }

    }
}

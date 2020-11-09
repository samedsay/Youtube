package com.samedify.switchCase;

public class SwitchCase {

    public static void main(String[] args) {

        int value = 3;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }

        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Value is not 1 or 2");
                break;

        }

        char valueChar = 'E';
        switch (valueChar) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("B,C,D or E");
                break;
            default:
                System.out.println("Not A or B");
                break;

        }

        String month = "februaRy";
        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("January");
                break;
            case "FEBRUARY":
                System.out.println("February");
                break;
            default:
                System.out.println("Not January or February");
                break;
        }
        
    }
}

package com.samedify.examples;

/*
    Write a method "hasEqualSum" with three parameters.
    The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to
    the third parameter. Otherwise, return false.
 */

public class EqualSumChecker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(3,4,5));
        System.out.println(hasEqualSum(-1,9,8));
        System.out.println(hasEqualSum(12,90,50));
        System.out.println(hasEqualSum(39,42,81));

    }

    public static boolean hasEqualSum(int first, int second, int third){

        if((first + second) != third){
            return false;
        }else{
            return true;
        }
    }


}

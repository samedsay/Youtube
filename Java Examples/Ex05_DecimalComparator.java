/*
    Write a method areEqualByThreeDecimalPlaces with two paramaters of type double.
    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.
    Otherwise, return false.

 */

public class DecimalComparator {

    public static void main(String[] args) {

        if (areEqualByThreeDecimalPlaces(-9.1803472, -9.801111111))
            System.out.println("Two numbers are same up to three decimal places.");
        else
            System.out.println("Two numbers are not same up to three decimal places.");


    }

    //  4,6803472   * 1000 -> 4680,3472
    //  4,680111111 * 1000 -> 4680,11111

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        number1 *= 1000;
        number2 *= 1000;

        int firstNumber = (int) number1;
        int secondNumber = (int) number2;

        if (firstNumber != secondNumber)
            return false;
        else
            return true;

    }

}













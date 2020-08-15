
/*
    Write a method isLeapYear with a parameter of type int named year.
    The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    If the parameter is not in that range return false.

    Otherwise, if it is in the valid range, calculate if the year is a leap and return true if it is a leap year , otherwise return false.

    A leap year is exactly divisible by 4 except for century years (years ending with 00).
    The century year is a leap year only if it is perfectly divisible by 400.

    The following years are not leap years:
    1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
    This is because they are evenly divisible by 100 but not by 400.

    The following years are leap years.
    1600, 2000, 2400.
    This is because they are evenly divisible by both 100 and 400.

 */


public class LeapYearCalculator {

    public static void main(String[] args) {

        int year = 2020;
        if(isLeapYear(year)){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }

    }

    public static boolean isLeapYear(int year){

        if(year < 1 && year > 9999){
            return false;
        }else if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
    
}

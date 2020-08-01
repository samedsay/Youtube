
/*
 *  Method Name : toMilesPerHour, return type : long
 *  1 parameter; type : double, name : kilometersPerHour
 *  Conditions :
 *      if kilometersPerHour < 0  --> return -1 ("invalid value")
 *      if kilometersPerHour > 0  --> return value (round it with Math.round method)
 *
 *  Method Name : printConversion, return type : void
 *  1 parameter; type : double, name : kilometersPerHour
 *  Print : "XX km/h = YY mi/h"
 *  Conditions :
 *      if kilometersPerHour < 0  --> return -1 ("invalid value")
 *
 *  Note: 1 mil = 1,609 km
 *
 */

public class SpeedConverter {

    public static void main(String[] args) {

        System.out.println(1.5 / 1.609 + " -- " + toMilesPerHour(1.5));
        System.out.println(10.25 / 1.609 + " -- " + toMilesPerHour(10.25));
        System.out.println(-9.0 / 1.609 + " -- " + toMilesPerHour(-9.0));
        System.out.println(14 / 1.609 + " -- " + toMilesPerHour(14));
        System.out.println(7.3 / 1.609 + " -- " + toMilesPerHour(7.3));
        System.out.println(7.7 / 1.609 + " -- " + toMilesPerHour(7.7));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-9.0);
        printConversion(14);
        printConversion(7.3);
        printConversion(7.7);

    }

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0)
            return -1;
        else
            return (long)Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion (double kilometersPerHour){

        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else {
            System.out.println(kilometersPerHour + " km/h = " + (kilometersPerHour / 1.609) + " mi/h");
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }



}

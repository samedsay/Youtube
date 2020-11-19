/*
 * Write a method printYearsAndDays with parameter of type long named minutes.
 * The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
 * If the parameter is less than 0, print text "Invalid Value".
 * Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
 *
 * XX represents the original value minutes.
 * YY represents the calculated years.
 * ZZ represents the calculated days.
 *
 * 1 hour = 60 minutes
 * 1 day = 24 hours
 * 1 year = 365 days
 *
 */

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(34164000);


    }

    public static void printYearsAndDays(long minutes) {

        long tempMin = minutes;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {


            int years = 0;
            int days = 0;

            while (minutes > 0) {

                if (minutes >= 1440) {
                    minutes -= 1440;
                    days++;
                } else {
                    break;
                }
            }

            while (days > 0) {
                if (days >= 365) {
                    days -= 365;
                    years++;
                } else {
                    break;
                }
            }

            System.out.println(tempMin + " min = " + years + " y and " + days + " d");

        }
    }

}

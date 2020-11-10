/*
 * Write a method named area with one double parameter named radius.
 * The method need to return a double value that represents the area of a circle.
 * If the parameter radius is negative then return -1.0 to represent an invalid value.
 * Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
 * The method needs to return an area of a rectangle.
 * If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
 *
 * TIPS:
 *      Area of rectangle is x * y.
 *      Area of circle is radius * radius * PI.
 *      Use Math.PI for PI constant.
 */

public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(10));   // 314...
        System.out.println(area(4, 5));   // 20.0
        System.out.println(area(-4));   // -1.0
        System.out.println(area(8, -2)); // -1.0

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }

}

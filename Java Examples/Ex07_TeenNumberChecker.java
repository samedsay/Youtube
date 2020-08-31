/*
    If the number is between 13-19(inclusive) -> teen number
    Write a method "hasTeen" with three parameters of type int.
    The method should return boolean and it needs to return true if one of the parameters in range
    13-19(inclusive).Otherwise return false.

 */

public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(12, 19, 20));
        System.out.println(hasTeen(11, 20, 30));
        System.out.println(hasTeen(13, 1, 19));
        System.out.println(hasTeen(12, 9, 23));


    }

    public static boolean hasTeen(int first, int second, int third) {

        if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)) {
            return true;
        } else {
            return false;
        }

    }
}

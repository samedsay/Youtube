public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;     // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);


        result++;   // result + 1
        System.out.println("4 + 1 = " + result);
        result--;
        System.out.println("5 - 1 = " + result);

        result += 6;    // result = result + 6
        System.out.println("4 + 6 = " + result);
        result -= 5;    // result = result - 5
        System.out.println("10 - 5 = " + result);
        result *= 4;    // result = result * 4
        System.out.println("5 * 4 = " + result);
        result /= 5;    // result = result / 5
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // (4 mod 3)
        System.out.println("4 % 3 = " + result);
        result %= 1;    // result = result % 1
        System.out.println("1 % 1 = " + result);

        //System.out.println("\uD83E\uDD13");

        int myInt = 15;
        System.out.println("15 (Decimal) = " + myInt);
        int myBinary = 0b1111;
        System.out.println("1111 (Binary) = " + myBinary + " (Decimal)");
        int myOctal = 017;
        System.out.println("17 (Octal) = " + myOctal + " (Decimal)");
        int myHex = 0xF;
        System.out.println("F (Hexadecimal) = " + myHex + " (Decimal)");

        /*
        DECIMAL (10) => 0,1,2,3,4,5,6,7,8,9,10,19,20,..,99,100
        BINARY  (2)  => 0,1,10,11,100,101,110,111,1000
        OCTAL   (8)  => 0,1,2,3,4,5,6,7,10,11,12,13,14,15,16,17,20,..27,30
        HEXADEC.(16) => 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,10,11,..19,1A,1B
                        1C,1D,1E,1F,20


         */
        int binaryNumber = 0b1101;
        System.out.println(binaryNumber);
        int octalNumber = 06127;
        System.out.println(octalNumber);
        int hexNumber = 0xABF9;
        System.out.println(hexNumber);

        /*
        
        3145 = (3 * 1000) + (1 * 100) + (4 * 10) + (5 * 1) = 145
        1101 = (1 * 2^3) + (1 * 2^2) + (0 * 2^1) + (1 * 2^0) = 8+4+0+1 = 13
        6127 = (6 * 8^3) + (1 * 8^2) + (2 * 8^1) + (7 * 8^0) = 3072 + 64 + 16 + 7 = 3159
        ABF9 = (10 * 16^3) + (11 * 16^2) + (15 * 16^1) + (9 * 16^0) =
                40960 + 2816 + 240 + 9 = 44025

        */
        
    }
}

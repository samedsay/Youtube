/*
 *  Method Name : printMegaBytesAndKiloBytes, return type : void
 *  1 parameter; type : int, name : kiloBytes
 *  Print : "XX KB = YY MB ZZ KB"
 *  Conditions :
 *      if kiloBytes < 0  --> return -1 ("invalid value")
 *
 *  Note: 1 MB = 1024 KB
 *
 */

public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(34560);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int XX = kiloBytes;
        int YY = 0;
        int ZZ = 0;

        if (XX >= 0) {

            YY = XX / 1024;
            ZZ = XX % 1024;

            System.out.println(XX + " KB = " + YY + " MB " + ZZ + " KB");

        } else {
            System.out.println("Invalid Value.");
        }

    }
}


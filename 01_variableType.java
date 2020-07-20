public class Main {

    public static void main(String[] args){

        int myMinimumIntegerValue = Integer.MIN_VALUE;
        int myMaximumIntegerValue = Integer.MAX_VALUE;
        System.out.println("myMinimumIntegerValue: " + myMinimumIntegerValue);
        System.out.println("myMaximumIntegerValue: " + myMaximumIntegerValue);

        short myMinimumShortValue = Short.MIN_VALUE;
        short myMaximumShortValue = Short.MAX_VALUE;
        System.out.println("myMinimumShortValue: " + myMinimumShortValue);
        System.out.println("myMaximumShortValue: " + myMaximumShortValue);

        byte myMinimumByteValue = Byte.MIN_VALUE;
        byte myMaximumByteValue = Byte.MAX_VALUE;
        System.out.println("myMinimumByteValue: " + myMinimumByteValue);
        System.out.println("myMaximumByteValue: " + myMaximumByteValue);

        long myMinimumLongValue = Long.MIN_VALUE;
        long myMaximumLongValue = Long.MAX_VALUE;
        System.out.println("myMinimumLongValue: " + myMinimumLongValue);
        System.out.println("myMaximumLongValue: " + myMaximumLongValue);

        int myInteger = 2_147_483_647;
        long myLong = 9_875987_4938759_5807L;
        short myShort = (short) 65536;
        byte myByte = (byte) 127;

        System.out.println(myShort + " <-> " + myByte);

        float myMinimumFloatValue = Float.MIN_VALUE;
        float myMaximumFloatValue = Float.MAX_VALUE;
        System.out.println("myMinimumFloatValue: " + myMinimumFloatValue);
        System.out.println("myMaximumFloatValue: " + myMaximumFloatValue);

        double myMinimumDoubleValue = Double.MIN_VALUE;
        double myMaximumDoubleValue = Double.MAX_VALUE;
        System.out.println("myMinimumDoubleValue: " + myMinimumDoubleValue);
        System.out.println("myMaximumDoubleValue: " + myMaximumDoubleValue);

        int myInt = 5 / 3;
        float myFloat = 5f / 3;
        double myDouble = 5d / 3;

        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);

        float myPI = 3.1415927f;
        double myAnotherNumber = 123_000_0.23_231_23;
        double myTotal = myPI + myAnotherNumber;
        System.out.println("my Total = " + myTotal);

        char myChar = '\u0047';

        System.out.println("My character is " + myChar);

        boolean myFlag = true;
        boolean amIAStudent = false;
        System.out.println("Am I a student ? Is this question' answer true or false?" + amIAStudent);


        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myChannelName = "Samedify!";
        System.out.println("My channel name is " + myChannelName);
        myChannelName = myChannelName + "\u00A9 2020";
        System.out.println("My channel name is " + myChannelName);
        double year = 2020.0;
        myChannelName = myChannelName + year;
        System.out.println("My channel name is " + myChannelName);

        int numberOne = 50;
        int numberTwo = 50;
        System.out.println(""+ numberOne + numberTwo);

        int myBinary = 0b11;
        int myOctal = 011;
        int myHexadecimal = 0x11;
        System.out.println(myBinary + " is 11 in Binary.");
        System.out.println(myOctal + " is 11 in Octal.");
        System.out.println(myHexadecimal + " is 11 in Hexadecimal.");
        
    }
}

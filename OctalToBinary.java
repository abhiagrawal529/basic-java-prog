// Java program to convert
// Octal number to Binary
package com.company;
import java.util.*;
class OctalToBinary {

    // function to convert octal number
    // to its binary equivalent value
    public static String converter(String octalValue)
    {

        // parsing the string value
        // by following octal number system
        int octal = Integer.parseInt(octalValue, 8);

        // converting octal number to binary
        // and storing as a string
        String binaryValue = Integer.toBinaryString(octal);

        // returning the resultant string
        return binaryValue;
    }

    public static void main(String args[])
    {

        System.out.println("Octal to Binary Conversion\n");
        Scanner sc = new Scanner(System.in);
        // octal number which is to be converted
        String octalNumber = sc.nextLine();
        System.out.println("Octal number: " + octalNumber);

        // calling the converter method and
        // storing the result in a string variable
        String result = converter(octalNumber);

        // printing the binary equivalent value
        System.out.println("Binary equivalent value is: "
                + result);
    }
}

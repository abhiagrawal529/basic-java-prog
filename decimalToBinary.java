package com.company;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        // Create scanner class object
        Scanner in = new Scanner(System.in);

        //Take input from user
        System.out.println("Enter decimal number:");
        int num = in.nextInt();

        System.out.print("Binary Number of " + num + " is ");
        System.out.print(Integer.toBinaryString(+num));

    }
}
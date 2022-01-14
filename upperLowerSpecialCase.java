package com.company;

import java.util.Scanner;

public class upperLowerSpecialCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character here:");
        char userInput = sc.next().charAt(0);
        if (userInput >= 65 && userInput <= 91)
            System.out.println(userInput + " is in upper case letter");
        else if (userInput >=97 && userInput <= 127)
            System.out.println(userInput + " is in lower case letter");
        else
            System.out.println(userInput + " is in special case letter");
    }
}

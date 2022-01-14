package com.company;

import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number: ");
                int bnum = Integer.parseInt(scanner.nextLine(), 2);
                String ostr = Integer.toOctalString(bnum);
                System.out.println("Octal Value after conversion is: " + ostr);
            }
        }

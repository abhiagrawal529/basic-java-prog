package com.company;

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        float no = sc.nextFloat();
        System.out.println("square root of :" + no + Math.sqrt(no));

    }
}

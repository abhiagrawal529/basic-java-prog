package com.company;

import java.util.Scanner;

public class smallestOfThreeUsingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1:");
        int no1 = sc.nextInt();
        System.out.println("enter no2:");
        int no2 = sc.nextInt();
        System.out.println("enter no3:");
        int no3 = sc.nextInt();
        int smallOfTwo = Math.min(no1,no2);
        System.out.println("smallest no is: " + Math.min(smallOfTwo,no3));
    }
}

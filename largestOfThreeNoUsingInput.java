package com.company;
import java.util.Scanner;
public class largestOfThreeNoUsingInput {
    public static void main(String[] args) {
        // to find largest of three no using inbuild function and taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1 here:");
        int no1 = sc.nextInt();
        System.out.println("enter no2 here:");
        int no2 =  sc.nextInt();
        System.out.println("enter no3 here:");
        int no3 = sc.nextInt();
        int greatOfTwo = Math.max(no1,no2);
        System.out.println("greatest number is :"+Math.max(greatOfTwo,no3));

    }
}

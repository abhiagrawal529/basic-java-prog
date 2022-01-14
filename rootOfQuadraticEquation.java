package com.company;

import java.util.Scanner;

public class rootOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of coeficient of x^2 :");
        int a = sc.nextInt();
        System.out.println("enter value of coeficient of x :");
        int b = sc.nextInt();
        System.out.println("enter value of constant term :");
        int c = sc.nextInt();
        int disc = (b*b) - (4*a*c);
        double root1 = (double) (-b/(2*a)) + (Math.sqrt(disc)/(2*a));
        double root2 = (double) (-b/(2*a)) - (Math.sqrt(disc)/(2*a));
        if (disc == 0 )
            System.out.println("roots are:"+root1+" , "+root2);
        else if (disc >= 0)
            System.out.println("roots are:"+root1+" , "+root2);
        else
            System.out.println("roots are imaginary.");
    }
}

package com.company;
import java.util.Scanner;
public class arithmaticOperationUsingInput {
    public static void main(String[] args){
        // to perform all arithmatic operation by taking input from user
        // so we used scanner class to take input from user -> scanner varname = new Scanner(system.in) ->system.in means using keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for number 1 here:");
        int no1 = sc.nextInt();
        System.out.println("enter value for number 2 here:");
        int no2 = sc.nextInt();
        System.out.println("addition of " + no1 +" + " + no2 +" = "+(no1+no2));
        System.out.println("subtraction of " + no1 +" - " + no2 +" = "+(no1-no2));
        System.out.println("multiplication of " + no1 +" * " + no2 +" = "+(no1*no2));
        System.out.println("division of " + no1 +" / " + no2 +" = "+(no1/no2));
        System.out.println("remainder when " + no1 +" divided by " + no2 +" is "+(no1%no2));
    }
}

package com.company;

public class largestOfThreeNo {
    public static void main(String[] args) {
        //to find largest of three numbers
        int no1 = 5, no2 = 10, no3 = 56;
        if (no1 > no2) {
            if (no1 > no3) {
                System.out.println(no1 + " is largest no.");
            } else {
                System.out.println(no3 + " is largest no.");
            }
        } else {

             if (no2 > no3) {
                System.out.println(no2 + " is largest no.");
            } else {
                System.out.println(no3 + " is largest no.");
            }

        }
    }
}

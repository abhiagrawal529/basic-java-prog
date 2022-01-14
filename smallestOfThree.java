package com.company;

public class smallestOfThree {
    public static void main(String[] args) {
        // to find smallest of three number
        int no1 = 2,no2 = 3,no3 = 1;
        if (no1 < no2){
            if (no1 < no3)
                System.out.println("smallest no is :"+ no1);
            else
                System.out.println("smallest no is :" + no3);
        }
        else {
            if (no2 > no3)
                System.out.println("smallest no is :"+ no3);
            else
                System.out.println("smallest no is :" + no2);
        }
    }
}

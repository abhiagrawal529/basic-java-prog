package com.company;
import java.util.Scanner;
public class tableOfInput {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number whose table you wanted: ");
//reading a number whose table is to be print
                int a=sc.nextInt();
//loop start execution form and execute until the condition i<=10 becomes false
                for(int i=1; i <= 10; i++)
                {
//prints table of the entered number
                    System.out.println(a+" * "+i+" = "+a*i);
                }
    }
}

package com.company;
import java.util.Scanner; 
public class BinaryToHexa {
    public static void main(String[] args) {

        int bin_num , hexDigit = 0 , m=1 ,c=1 ,rem , i=0 ;
                char[] hex_num = new char[20];

                Scanner scan = new Scanner(System.in);

                System.out.println("Enter the Binary Number :");
                bin_num = scan.nextInt();
                while(bin_num!=0)
                {
                    rem = bin_num%10;
                    hexDigit = hexDigit + (rem*m);

                    if( c%4 == 0){
                        if (hexDigit<10)
                            hex_num[i] = (char)(hexDigit + 48);

                        else
                            hex_num[i] = (char)(hexDigit + 55);

                        m=1;
                        c=1;
                        hexDigit=0;
                        i++;
                    }


                    else{
                        m=m*2;
                        c++;

                    }

                    bin_num=bin_num/10;
                }

                if(c!=1)
                    hex_num[i]= (char)(hexDigit + 48);

                if(c==1)
                    i--;

                System.out.println("\n Equivalent Hexadecimal Value =");

                for( i=1; i>=0 ; i--)
                    System.out.println(hex_num[i]);


            }
        }

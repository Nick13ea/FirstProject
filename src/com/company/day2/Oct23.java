package com.company.day2;

import java.util.Scanner;

public class Oct23 {
    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1 || i == 3) {
            System.out.println("even");

        } else if (i==2) {
            System.out.println("odd");
        }else System.out.println("enter b/w range");
        //recap for if else statements
       /*if (monthNo == 1 || monthNo == 3||monthNo == 5 || monthNo == 7||monthNo == 8 || monthNo == 10||monthNo==12)
        {
            System.out.println("31days");
        }
        else if(monthNo == 4 || monthNo == 6||monthNo == 9 || monthNo == 11)
        {
            System.out.println("30days");
        }
        else if (monthNo == 2)
        {
            System.out.println("28 days");
        }
        else
        {
            System.out.println("plz enter a no in b/w 1 & 12 only");
        }*/
    }
}
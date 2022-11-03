package com.company.day2;

import java.util.Scanner;

//switch{}
//case: //break
public class SwitchDemo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int monthNo = scanner.nextInt();
        switch (monthNo) {
            case 1: case 3: case 5: case 7:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28/29 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
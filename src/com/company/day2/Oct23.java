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
    }
}
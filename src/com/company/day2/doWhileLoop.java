package com.company.day2;

public class doWhileLoop {
    public static void main(String[] args) {
        //double for loop ;;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            int k=1,l=1;
            while(k<=l){
                System.out.println("hello");
                k++;
            }

        }
    }
}
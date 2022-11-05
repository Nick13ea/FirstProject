package com.company.day2;

import java.util.Random;

public class Array03novRepeat {
    public static void main(String[] args) {
        //to create 1000 randoms
        //int array to store 100 values
        int marks[] = new int[20];
        initializeArray(marks);
        char[] firstName = new char[5];
        firstName(firstName);
        //create a char array which prints 1st name
//declare an array which holds 10 decimal values
// and calculate sum of those values
        //answer
        //declaring an array


        Random r = new Random();
        int decimalValues[] = new int[10];
        int sum = 0;
        for (int i = 0; i < decimalValues.length; i++) {
            // sum=sum+ r.nextInt();
            System.out.println(i + decimalValues[i]);
            sum = sum + i + decimalValues[i];
            System.out.println(sum);
        }
    }

    public static void initializeArray(int[] marks) {
        Random r = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = r.nextInt(10);
        }
    }

    public static void firstName(char[] fName) {
        char[] firstName = {'N', 'I', 'C', 'K'};
        System.out.println(firstName);
        System.out.println("this is my firstName bro");
    }
}


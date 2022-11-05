package com.company.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    //its just like <from line 29 7 to 10 lines>
    //1) int[]marks={1,2,3,4,5}; // <check line 11>
    //2) int[]marks=new int[]{1,2,5,4,3};
    //3) int[]marks=new int[5]{1,2,5,4,5}; // this is wrong way
    public static void main(String[] args) {
        //int array
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter marks: ");
            arr[i] = sc.nextInt();
            //System.out.println(arr[2]);
        }
        System.out.println(Arrays.toString(arr));

        //string array
        String[] arrr = new String[3];
        arrr[0] = "Nikhil";
        arrr[1] = " ";
        arrr[2] = "Salaria";//one way of entering data in arrays
        String[] arr1 = {"Nikhil", "", "Salaria"};//other way of entering data

    }
}



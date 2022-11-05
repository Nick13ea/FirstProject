package com.company.day2;

public class ArrayExercise {
    public static void main(String[] args) {

        //create a marks array to store marks by 1 student in 5 subjects
        // and print total marks scored by the student
        // int[] marks = new int[6];
        int[] marks = new int[]{1, 2, 3, 4, 5};
        int i = 0;
       // int j=0;
        for (int a = 0; a < marks.length; a++) {
            i = i + marks[a];
        }
        System.out.println("total marks for student is "+i);
    }
}




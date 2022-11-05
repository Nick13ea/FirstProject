package com.company.day2;

import java.util.Random;

public class ArrayDemo2
{
    public static void main(String[] args)
    {
        int marks[] = new int[10];
        InitializeArray(marks);
    }
    public static void InitializeArray(int[]marks){
        Random r = new Random();
        for (int i = 0; i < marks.length; i++)
        {
            marks[i] = r.nextInt(10);
        }
    }
}

package com.company.day2;

import java.util.Random;

//2D array is an array of an array
// 1st sq bracket represent rows
// 2nd represent columns
public class Array2DDemo {
    public static void main(String[] args) {
        int[][] a =
                {
                        {2, 4, 2, 3},
                        {3, 3, 6, 9},
                        {4, 2, 1, 7},
                };
        a[0][0] = 10;a[0][1] = 10;a[0][2] = 10;a[0][3] = 10;
        a[1][0] = 10;a[1][1] = 10;a[1][2] = 10;a[1][3] = 10;
        a[2][0] = 10;a[2][1] = 10;a[2][2] = 10;a[2][3] = 10;

        int[][] marks = new int[3][4];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++)
            {
               marks[i][j]=random.nextInt(100);
               System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}

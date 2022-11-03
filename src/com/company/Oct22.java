package com.company;

//we are doing if-else, for and while loops today
public class Oct22 {
    public static void main(String[] args) {
        testEvenOdd(12);
        testPosNeg(0);
        testMonthDays(11);
        greatestOf3(3, 3, 2);
        checkIllegibility(true);
    }

    //even odd function
    public static void testEvenOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

    //positive negative zero
    public static void testPosNeg(int y) {
        if (y > 0) {
            System.out.println("positive");
        } else if (y < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    //testing month and days
    public static void testMonthDays(int month) {
        if (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 ||
                month == 10 || month == 12) {
            System.out.println("there are 31 days in " + month);
        } else if (month == 4 || month == 6 ||
                month == 9 || month == 11) {
            System.out.println("there r 30 days in " + month + "th month");
        } else if (month == 2) {
            System.out.println("28");
        } else
            System.out.println("there r 12 " +
                    "months only");
    }

    public static void greatestOf3(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("largest no is " + a);
        } else if (b >= c && b >= a) {
            System.out.println("largest no is " + b);
        } else
            System.out.println("Largest no is " + c);
    }
    public static void checkIllegibility(boolean nick){
        if(!nick)
        {
            System.out.println("Print"+ false);
            System.out.println("Upload to Git");
        }
    }
}

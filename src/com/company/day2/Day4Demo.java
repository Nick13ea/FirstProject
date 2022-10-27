package com.company.day2;

public class Day4Demo {
    //whatever is common for everyone is static ex: clg name
    //whatever is not is not static its instant ex: student name
    public static void main(String[] args)
    {
        int i = findDoubleAge(20, 8);
        System.out.println(i );

        double cc = findtripleAge(1.5,3.3);
        System.out.println(cc);

        String name = "Nikhil";
        int num =105;

    }
    //product of clASS,
    // --class is an idea,
    //--object is the reality
    //when 2 no gives result of a no its called arithmatic operator
     //   + - * / %
    //when 2 no gives result of a boolean its called relational operator
    // > < <= >= ==
    public static int findDoubleAge
            (int n, int o)
    {
        return n+o;
    }
    public static double findtripleAge
            (double aa, double bb)
    {
        return aa*bb/aa;
    }
    public static void extractLastDigit(int num)
    {
        System.out.println(num%10);
    }
}


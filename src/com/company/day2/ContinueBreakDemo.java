package com.company.day2;

public class ContinueBreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("start"+i);
            if (i == 5)
            {
                continue;
            } else if (i==6)
            {
                break;
            }
            System.out.println("end"+i);
        }
    }
}


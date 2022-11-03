package com.company.day2;

import java.util.Scanner;

/*syntax while(condition)
     {
     code
     }*/
/*syntax do-while --never used in industry but informative only
int a=10;
do
{ sout();
a++;
}while(a>1);
*/
public class WhileLoop29Oct {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
            System.out.println("play guess game");
            System.out.println("i hv guessed the no, wbu");
        Scanner scanner = new Scanner(System.in);
        int guessNo = scanner.nextInt();
        while (random != guessNo) {
            //only if he enters the while loop
            System.out.println("sorry ur guess was wrong plz try again");
            guessNo = scanner.nextInt();
            //  break;
        }
            //if he  just finds out in 1st try
            System.out.println("you win.");
    }
}



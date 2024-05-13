package org.example;

import java.util.Scanner;

public class MakingDecision_Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Display sum of number divied by 2 from 1 to number user input !!");
        System.out.println("Input a number");
        int number = sc.nextInt();
        int total =0;
        if(number <=1)
        {
            System.out.println("Please input again!!");
        }
        else
        {
            for(int i = 1; i <= number; i++)
            {
                if(i%2==0)
                {
                    total = total +i;
                }
            }
        }
        System.out.println("Sum of number divied by 2 from 1 to number user input is : "+total);
    }
}

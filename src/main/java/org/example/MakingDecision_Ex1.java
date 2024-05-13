package org.example;

import java.util.Scanner;

public class MakingDecision_Ex1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number check if it divided by 3 and 5 simultaneously ?");
        System.out.println("Input number : ");
        int number = Integer.parseInt(String.valueOf(scanner.nextInt()));
        if(number %3 ==0 && number %5 ==0)
        {
            System.out.println("Number " + number + " divided by 3 and 5 simultaneously");
        }
        else
        {
            System.out.println("Number " + number + " not divided by 3 and 5 simultaneously");
        }
    }
}
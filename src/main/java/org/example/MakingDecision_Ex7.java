package org.example;

import java.util.Scanner;

public class MakingDecision_Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Checking odd numbers or not ");
        System.out.println("2.Checking prime number");
        System.out.println("3.Checking divied by 3 or not");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Input a number to checking odd numbers or not :");
                int check = sc.nextInt();
                if(check%2 ==0)
                {
                    System.out.println("This is not odd number");
                }
                else
                {
                    System.out.println("This is odd number");
                }
                break;
            case 2:
                int i,m=0,flag=0;
                System.out.println("Input a number to checking prime numbers or not :");
                int n = sc.nextInt();
                m=n/2;
                if(n==0||n==1){
                    System.out.println(n+" is not prime number");
                }else{
                    for(i=2;i<=m;i++){
                        if(n%i==0){
                            System.out.println(n+" is not prime number");
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)  { System.out.println(n+" is prime number"); }
                }//end of else
        break;
            case 3:
                System.out.println("Input a number to checking does it divied by 3 or not :");
                int check3 = sc.nextInt();
                if(check3%3 ==0)
                {
                    System.out.println("This number is divied by 3");
                }
                else
                {
                    System.out.println("This is not ");
                }
                break;
            default: System.out.println("Over");
        }
    }
}

package org.example;

import java.util.Scanner;

public class MakingDecision_Ex8 {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        System.out.println("Checking 3 sides of a triangle");
        System.out.println("Input side a :");
        int a = sc.nextInt();
        System.out.println("Input side b :");
        int b = sc.nextInt();
        System.out.println("Input side c :");
        int c = sc.nextInt();
        int hP;
        hP = (a+b+c)/2;
        if(a+b >c && a+c>b && b+c >a)
        {
            System.out.println("Perimeter of triangle is " +(a+b+c));
            System.out.println("Area of triangle is "+ Math.sqrt(hP*(hP-a)*(hP-b)*(hP-c)));
        }

    }
}

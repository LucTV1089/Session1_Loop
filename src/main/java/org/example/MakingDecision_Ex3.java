package org.example;

public class MakingDecision_Ex3 {
    public static void main(String[] args) {
            System.out.println("Display all number from 1 to 100 divided by 3 and 5 !!");
            for(int i = 1;i<=100;i++) {
                if(i%3==0 && i%5==0) {
                    System.out.println(i);
                }
            }
    }
}

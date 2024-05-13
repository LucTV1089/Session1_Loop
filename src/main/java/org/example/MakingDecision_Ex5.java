package org.example;

public class MakingDecision_Ex5 {
    public static void main(String[] args) {
        System.out.println("Display Prime Numbers");
        for (int i = 0; i <=100;i++)
        {
            if(isPrimeNumber(i))
            {
                System.out.println(i+ "");
            }
        }
    }
    public static boolean isPrimeNumber(int n)
    {
        if(n < 2)
        {
            return false;
        }
        int check = (int)Math.sqrt(n);
        for(int i = 2; i <= check; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

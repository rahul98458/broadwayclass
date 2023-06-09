package Controlstatement.Assignment;

import java.util.Scanner;

public class Primetest {
    public static void main(String[] args) {
        int n,s=0;
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        in.close();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                s=s+1;
            }
        }
        if(s>2 || n==0||n==1)
        {
            System.out.println("not prime");
        }
        else
        {
            System.out.println("prime");
        }
    }
    
}

package Controlstatement.Assignment;

import java.util.Scanner;

public class Primebetween {
    
    public static void main(String[] args) {
        int n1,n2,s=0;
        int js=0;
        System.out.println("enter the 1st number");
        Scanner in=new Scanner(System.in);
        n1=in.nextInt();
        System.out.println("enter the last number");
        n2=in.nextInt();
        in.close();
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                s=s+1;
            }
        }
        if(s<=2 && n1!=0 && n1!=1) 
        {
            System.out.println(n1);
        }
        for(int j=n1+1;j<=n2;j++)
        {
            if(j==1)
            {
                continue;
            }
            for(int i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    js=js+1;
                }
            }
            if(js<=2)
                {
                    System.out.println(j);
                }
                js=0;
           
        }
    }

}

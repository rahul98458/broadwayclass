package Controlstatement.Looping;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int a,factor=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value of a");
        a = in.nextInt();
        in.close();
        while (a>1)
        {
            factor=factor*a;
            a--;
        }
        System.out.println("the factor is "+factor);
    }
    
}

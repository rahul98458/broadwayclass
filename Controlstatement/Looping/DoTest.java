package Controlstatement.Looping;

import java.util.Scanner;

public class DoTest {
    public static void main(String[] args) {
        int a,i=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value of a");
        a = in.nextInt();
        in.close();
        do
        {
            System.out.println(a+" X "+i+"= "+(a*i));
            i++;
        }
        while(i<=10);
    }
    
}

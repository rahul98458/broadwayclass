package Controlstatement.Selection.Switch;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        float a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value of a");
        a = in.nextFloat();
        System.out.println("Enter Value of b");
        b = in.nextFloat();
        System.out.println("Enter the operation you want to perform");
        char operator = in.next().charAt(0);
        in.close();
        float result;
        switch(operator)
        
    {
        case '+' :
        result=a+b;
        System.out.println("The addition of given 2 data is "+result);
        break;

        case '-' :
        result=a-b;
        System.out.println("The subtraction of given 2 data is "+result);
        break;

        case '*' :
        result=a*b;
        System.out.println("The multiplication of given 2 data is "+result);
        break;

        case '/' :
        result=a/b;
        System.out.println("The division of given 2 data is "+result);
        break;

        default :
        System.out.println("wrong operator choosed");
    }
       }

    }

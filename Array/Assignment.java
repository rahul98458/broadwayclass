package Array;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total=0;
        int average;
        int price[]= new int[10];
        System.out.println("enter the price of 10 books");
        for (int i=0;i<price.length;i++)
        {
            price[i]=in.nextInt();
            total=total+price[i];
        }
        in.close();
        average=total/10;
        System.out.println(total+" "+average);
    }
    
}

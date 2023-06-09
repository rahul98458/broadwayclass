package Array;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int age[]=new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<age.length;i++)
        {
            System.out.println("enter age");
            age[i]=in.nextInt();
        }
        in.close();
        for(int x:age)
        System.out.println(x);
    }
}

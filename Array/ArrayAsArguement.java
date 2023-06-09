package Array;

import java.util.Scanner;

public class ArrayAsArguement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter number");
            data[i]=in.nextInt();
        }
        in.close();
        getSum(data);
    }
    static void getSum(int[] array)
    {
        int s=0;
        for (int x: array) {
            s=s+x;
        }
        System.out.println(s);
    }
}

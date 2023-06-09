package Array;

import java.util.Scanner;

public class ArrayAsArguementAndReturn {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] num=new int[10];
        System.out.println("enter 10 number");
        for(int i=0;i<10;i++)
        {
            System.out.println("enter "+(i+1)+" number");
            num[i]=in.nextInt();
        }
        in.close();
       int[] svalues = getNumLessThan50(num);
        sum(svalues);
        
    
        
    }
   static int[] getNumLessThan50(int[] data)
    {
        
        int[] gn=new int[5];
        int j=0;
        for(int i=0;i<10;i++)
        {
            if(data[i]<50)
            {
              gn[j]=data[i];
              j++;
            }
        }
        return gn;
    }

   static void sum(int[] arr)
    {
        int s=0;
        for (int x : arr) {
            s=s+x;
        }
        System.out.println(s);
    }
}

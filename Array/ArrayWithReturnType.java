
// wap to ask user to input 10 number and find the sum of numbers less than 50..
//note 5 number should be less than 50 and 5 number should greater than 50 

package Array;

import java.util.Arrays;

public class ArrayWithReturnType {
    public static void main(String[] args) {
        getSum(getOddNum());
        System.out.println(Arrays.toString(getOddNum()));
        
    }
   static int[] getOddNum()
    {
        int[] onum=new int[50];
        int j=0;
        for(int i=0;i<100;i++)
        if(i%2!=0)
        {
            onum[j]=i;
            j++;
        }
        return onum;
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

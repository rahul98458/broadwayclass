package Array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int data[]={2,3,1,4,5,7,6,9,8};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        System.out.println("rev order");
        for(int i=data.length-1;i>=0;i--){
            System.out.print(data[i]);
        }
        System.out.println();
        Arrays.fill(data, 300);
        System.out.println(Arrays.toString(data));
        Arrays.fill(data,3,7,200);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(Arrays.copyOf(data, 7)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(data,2,6)));
    }
}


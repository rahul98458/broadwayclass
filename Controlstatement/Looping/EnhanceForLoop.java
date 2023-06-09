package Controlstatement.Looping;

public class EnhanceForLoop {
    public static void main(String[] args) {
        int values[]={1,2,3,4,5};
        int sum=0;
        for (int x : values)
        {
            System.out.println(x);
            sum=sum + x;
        }
        System.out.println(sum);
    }
    
}

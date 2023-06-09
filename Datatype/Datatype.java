import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        int value1;
        int value2;

        Scanner sca = new Scanner(System.in);

        System.out.println("enter 1st value");
        value1=sca.nextInt();

        System.out.println("enter 2nd value");
        value2=sca.nextInt();
        sca.close();
        int value3=value1*value2;
        System.out.println("The multiplication is "+value3);
         System.out.println("short datatype detail "+Short.MIN_VALUE+"  "+Short.MAX_VALUE+" "+Short.SIZE);
        System.out.println("int datatype detail "+Integer.MIN_VALUE+"  "+Integer.MAX_VALUE+" "+Integer.SIZE);
        System.out.println("long datatype detail "+Long.MIN_VALUE+"  "+Long.MAX_VALUE+" "+Long.SIZE);                 
       
    }
    
}

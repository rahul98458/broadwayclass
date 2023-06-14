package OOP;

import java.util.Scanner;

public class R {
    int length;
    int beadth;
    public R(int length, int beadth) {
        this.length = length;
        this.beadth = beadth;
    }
    int area()
    {
        return (length*beadth);
    }
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("enter length");
        int c = in.nextInt();
        System.out.println("enter breadth");
        int d = in.nextInt();
        R obj=new R(c,d);
        in.close();
        System.out.println("The area is "+obj.area());
    }
}

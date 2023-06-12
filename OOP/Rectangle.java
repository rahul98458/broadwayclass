package OOP;

import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

    void displayArea()
    {
        int a = length*breadth;
        System.out.println("area = "+a);
    }
    void displayPerimeter()
    {
        int p = 2*(length+breadth);
        System.out.println("perimetr = "+p);
    }
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length");
        obj.length=in.nextInt();
        System.out.println("enter the breadth");
         obj.breadth=in.nextInt();
        obj.displayArea();
        obj.displayPerimeter();
        in.close();
        //  Rectangle obj2 = new Rectangle();
        //   System.out.println("enter the length");
        // obj2.length=in.nextInt();;
        //  System.out.println("enter the breadth");
        // obj2.breadth=in.nextInt();
        // in.close();
        // obj2.displayArea();
        // obj2.displayPerimeter();
    }
}

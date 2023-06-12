package OOP;

public class RectangleConstructor {
    
    static int area(int l,int b)
    {
        int a=l*b;
        return a;
       
    }
    public static void main(String[] args) {
       int c= area(4, 5);
      int d=  area(2, 4);
        System.out.println(c);
         System.out.println(d);
    }
}

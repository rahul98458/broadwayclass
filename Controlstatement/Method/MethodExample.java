package Controlstatement.Method;

public class MethodExample {
   static void display1()
    {
        System.out.println("no argument and no return");
    }
    static void display2(int n){
         System.out.println("argument and no return");
    }
    static String display3()
    {
        //String msg="no argument and return";
        return "no argument and return";
    }
    static int display4(int a,int b)
    {
        System.out.println("return type and arguments");
       return (a+b);
    }
    public static void main(String[] args) {
        display1();
        display2(2);
        String c=display3();
        System.out.println(c);
        System.out.println(display4(2,4));
    }
}

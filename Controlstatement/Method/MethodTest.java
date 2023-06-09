package Controlstatement.Method;



public class MethodTest {
    public static void main(String[] args) {
        add();
        area();
        printTable(10);
        int b=getSum1to100();
        System.out.println(b);
        int c=getSum1to50(50);
        System.out.println(c);
        int sm=getSmall(50,100);
        System.out.println(sm);
    }

    // 1 no return type(void) with no arguements
   static void add()
    {
        int a=12;
        int b = 33;
        int c = a+b;
        System.out.println(c);
    }

    static void area()
    {
        int l=12;
        int b=12;
        int a = l*b;
        System.out.println(a);
    }


    // 2 no return type(void) with arguements

    static void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }


    // 3 return typ with no arguements
   static int getSum1to100()
    {
        int s=0;
        for(int i=1;i<=100;i++)
        {
            s=s+i;
        }
        return s;
    }


    // 4 return typ with n arguements
         // example 1 of type 4
   static int getSum1to50(int n)
   {
       int s=0;
       for(int i=1;i<=n;i++)
       {
           s=s+i;
       }
       return s;
   }
         // example 2 of type 4
         static int getSmall(int x,int y)
         {
             if(x<y)
             {
                return x;
             }
             else
             {
                return y;
             }
         }

}

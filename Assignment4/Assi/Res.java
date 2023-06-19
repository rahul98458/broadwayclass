package Assignment4.Assi;

import java.util.Scanner;

public class Res {
    Bookkk abc[]=new Bookkk[2];
     Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Res obj2 = new Res();
        obj2.add();
        obj2.display();
        obj2.addPrice();
    }
    void add()
    {
        String bname,aname;
        int bprice;
       
       for (int i = 0; i < abc.length; i++) {
        System.out.println("enter bname");
        bname=in.next();
        System.out.println("enter aname");
        aname=in.next();
        System.out.println("enter bprice");
        bprice=in.nextInt();
        Bookkk obj = new Bookkk(bname, aname, bprice);
        abc[i]=obj;
       
       }
}
void display()
{
    for (Bookkk bdata : abc) {
        System.out.println(bdata);
        
    }
}
 void addPrice()
{
 int p=0;
{
   for (Bookkk bdata : abc) {
    p = p + bdata.getPrice();
   }
}
System.out.println(p);
}
}


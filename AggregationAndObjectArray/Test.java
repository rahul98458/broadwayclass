package AggregationAndObjectArray;

import java.util.Scanner;
public class Test {
    StudentDetail[] std = new StudentDetail[2];
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       Test t = new Test();
       t.studentLaptopDetail();
       t.displayStudentLaptopDetail();
       t.displayByLaptop();
    }
    void studentLaptopDetail()
    {
        for (int i = 0; i < std.length; i++) {
            System.out.println("enter id");
            int id = in.nextInt();
            System.out.println("enter name");
            String name = in.next();
            System.out.println("enter address");
            String address = in.next();
            System.out.println("enter laptop brand");
            String brand = in.next();
            System.out.println("enter laptop model");
            String model = in.next();
            System.out.println("enter laptop price");
            int price=in.nextInt();
            Laptop lobj = new Laptop(brand, model, price);
             StudentDetail obj = new StudentDetail(id, name, address, lobj);
             std[i]= obj;
        }
    }
    void displayStudentLaptopDetail()
    {
        for (StudentDetail data : std) {
            System.out.println(data);
        }
    }
    void displayByLaptop()
    {
        System.out.println("enter laptop brand or model");
        String p = in.next();
         for (StudentDetail data : std) {
            int flag = data.getLappy().getModel().compareTo(p);
             if(flag==0)
            {
                System.out.println(data);
            }
             else if (flag==1)
             {
                flag = 0;
                flag = data.getLappy().getBrand().compareTo(p);
                if(flag==0)
                {
                    System.out.println(data);
                }
             }
             else
             {
                 System.out.println("srry");
             }
        }
    }
}

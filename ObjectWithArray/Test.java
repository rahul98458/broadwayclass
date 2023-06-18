package ObjectWithArray;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    
        addData();
       
        
    }
  static  void addData()
    {
         Student std[]=new Student[2];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<std.length;i++)
        {
            Student s = new Student();
            System.out.println("enter the id");
            s.setId(in.nextInt());
             System.out.println("enter the name");
              s.setName(in.next());
              System.out.println("enter the address");
               s.setAddress(in.next());
               System.out.println("enter the college");
                 s.setCollege(in.next());
                 std[i] = s;
           
                
                
        }
             in.close();
              for (Student x : std)  {
            System.out.println(x);
        }
             

            
               
        
    }
   
}

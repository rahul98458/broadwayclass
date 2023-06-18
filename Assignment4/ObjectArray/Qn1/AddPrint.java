package Assignment4.ObjectArray.Qn1;

import java.util.Scanner;

public class AddPrint {
     Book books[]=new Book[2];
      public static void main(String[] args) {
        AddPrint obj = new AddPrint();
       obj.add();
        obj.display();
        obj.total();
       
      }
    
void add()
{
  
    Scanner in = new Scanner(System.in);
    for(int i=0;i<books.length;i++)
    {
    Book bk = new Book();
    System.out.println("enter the book name");
    bk.setName(in.next());
     System.out.println("enter the book author");
    bk.setAuthor(in.next());
     System.out.println("enter the book price");
    bk.setPrice(in.nextInt());
    books[i]=bk;
    }
    in.close();
}
void display()
{
  for (Book bookdat : books) {
    System.out.println(bookdat);
  }

}
void total()
{
     int sum=0;
    for (Book bookdat : books) {
 sum = sum + bookdat.getPrice();
  }
  System.out.println("The total price is"+sum);
}


}

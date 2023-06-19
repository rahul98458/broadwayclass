package Assignment4.ObjectArray.Qn1;

import java.util.Scanner;

public class SearchByAuthor {
     Book books[]=new Book[2];
     Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        SearchByAuthor obj = new SearchByAuthor();
        obj.add();
         obj.searchByAuthor();
    }
    void add()
    {
   //     Scanner inp = new Scanner(System.in); 
    for(int i=0;i<books.length;i++)
    {
    Book bk = new Book();
    
    System.out.println("enter the book name");
    bk.setName(inp.next());
     System.out.println("enter the book author");
    bk.setAuthor(inp.next());
     System.out.println("enter the book price");
    bk.setPrice(inp.nextInt());
    books[i]=bk;
    }
  //inp.close();
}
    void searchByAuthor()
{
   // Scanner inp = new Scanner(System.in);
    
    System.out.println("enter the author name");
    String authName=inp.next(); 
    for (Book bookdat : books) {
     int flag = bookdat.getAuthor().compareTo(authName);
      {
         if(flag==0)
         {
            System.out.println(bookdat);
         }
      }
  }

}
}
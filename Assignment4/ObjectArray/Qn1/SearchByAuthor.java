package Assignment4.ObjectArray.Qn1;

import java.util.Scanner;

public class SearchByAuthor {
     Book books[]=new Book[2];
    // Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        SearchByAuthor obj = new SearchByAuthor();
        obj.add();
         obj.searchByAuthor();
    }
    void add()
    { 
    for(int i=0;i<books.length;i++)
    {
    Book bk = new Book();
    Scanner in = new Scanner(System.in);
    System.out.println("enter the book name");
    bk.setName(in.next());
     System.out.println("enter the book author");
    bk.setAuthor(in.next());
     System.out.println("enter the book price");
    bk.setPrice(in.nextInt());
    books[i]=bk;

    }
    
}
    void searchByAuthor()
{
    Scanner input = new Scanner(System.in);
    
    System.out.println("enter the author name");
    String authName=input.nextLine(); 
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

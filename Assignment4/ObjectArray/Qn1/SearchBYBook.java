package Assignment4.ObjectArray.Qn1;

import java.util.Scanner;

public class SearchBYBook {
     Book books[]=new Book[2];
     
    public static void main(String[] args) {
        SearchBYBook obj = new SearchBYBook();
        obj.add();
        obj.searchByBook();
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
    void searchByBook()
{
    Scanner input = new Scanner(System.in);
    
    System.out.println("enter the book name");
    String bookName=input.next(); 
    for (Book bookdat : books) {
     int flag = bookdat.getName().compareTo(bookName);
      {
         if(flag==0)
         {
            System.out.println(bookdat);
         }
      }
  }

}

}

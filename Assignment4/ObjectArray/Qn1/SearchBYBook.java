package Assignment4.ObjectArray.Qn1;

import java.util.Scanner;

public class SearchBYBook {
     Book books[]=new Book[2];
     Scanner inpu = new Scanner(System.in);
     
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
   //  Scanner inp = new Scanner(System.in);
    System.out.println("enter the book name");
    bk.setName(inpu.next());
     System.out.println("enter the book author");
    bk.setAuthor(inpu.next());
     System.out.println("enter the book price");
    bk.setPrice(inpu.nextInt());
    books[i]=bk;
    }
    
}
    void searchByBook()
{
   // Scanner input = new Scanner(System.in);
    
    System.out.println("enter the book name");
    String bookName=inpu.next(); 
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
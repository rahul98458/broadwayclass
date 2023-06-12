package OOP;

public class Student {
    String name;
    int rollnum;
 void displayStd()
 {
    System.out.println("name = "+name+" roll num = "+rollnum);
 }
 public static void main(String[] args) {
    Student obj = new Student();
    obj.name="Ram";
    obj.rollnum=2;
    obj.displayStd();
 }
}

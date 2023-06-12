package OOP;

public class Student2 {
    String name;
    String address;
    int roll;
    long phone;

    void displayInfo()
    {
        System.out.println(name+" "+address+" "+roll+" "+phone);
    }
    public static void main(String[] args) {
        Student2 obj1 = new Student2();
        obj1.name="sam";
        obj1.address="ktm";
        obj1.roll=3;
        obj1.phone=9811111111l;
        obj1.displayInfo();

         Student2 obj2 = new Student2();
        obj2.name="john";
        obj2.address="ngt";
        obj2.roll=5;
        obj2.phone=9811111123l;
        obj2.displayInfo();
    }
}

package OOP;

public class Employee {
    String name;
    int yearofjoining;
    int salary;
    String address;
    void displayInfo()
    {
        
        System.out.println(name+"             "+yearofjoining+"        "+address+"   "+salary);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(" Name     "+"Year of joining     "+"Address     "+"Salary");
        Employee obj = new Employee();                  // employee 1
        obj.name="Robert";
        obj.yearofjoining=1994;
        obj.address="64C-WallStreat";
        obj.salary=50000;
        obj.displayInfo();
    
     Employee obj1= new Employee();
        obj1.name="Sam";                  
        obj1.yearofjoining=2000;                          // employee 2
        obj1.address="64D-WallStreat";
        obj1.salary=20000;
        obj1.displayInfo();
    
     Employee obj3 = new Employee();
        obj3.name="John";                                // employee 3
        obj3.yearofjoining=1999;
        obj3.address="26B-WallStreat";
        obj3.salary=30000;
        obj3.displayInfo();
    }
}

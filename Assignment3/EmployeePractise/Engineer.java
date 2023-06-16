package Assignment3.EmployeePractise;

public class Engineer extends Employee{

    public Engineer(int id, String name, String ssn, double salary) {
        super(id, name, ssn, salary);
       
    }

    void printEmployee()
    {
        System.out.println(super.getId());
        System.out.println(super.getName());
        System.out.println(super.getSsn());
        System.out.println(super.getSalary());
    }
    
   
    
}

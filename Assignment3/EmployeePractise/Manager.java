package Assignment3.EmployeePractise;

public class Manager extends Employee {
    private String deptName;

    public Manager(int id, String name, String ssn, double salary, String deptName) {
        super(id, name, ssn, salary);
        this.deptName = deptName;
    }



    public String getDeptName() {
        return deptName;
    }
 void printEmployee()
    {
        System.out.println(super.getId());
        System.out.println(super.getName());
        System.out.println(super.getSsn());
        System.out.println(super.getSalary());
        System.out.println(getDeptName());
    }


   


    
    
}

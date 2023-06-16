package Assignment3.EmployeePractise;

public class EmployeeTest {

   
    public static void main(String[] args) {
       
        Engineer eobj = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager mobj = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketting");
        Admin aobj = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        Director dobj = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketting", 1_000_000);
         System.out.println(); 
        System.out.println("Engineer");
        eobj.printEmployee();
       System.out.println();
       System.out.println("Manager");
       mobj.printEmployee();
        System.out.println();
        System.out.println("Admin");
       aobj.printEmployee();
        System.out.println();
        System.out.println("Director");
       dobj.printEmployee();
       System.out.println();
       System.out.println("after changing engineer object name and increasing admin salary by 100000....");
       eobj.setName("Ramesh");
       aobj.raiseSalary(-100000);
       eobj.printEmployee();
       System.out.println();
       aobj.printEmployee();
    }
}

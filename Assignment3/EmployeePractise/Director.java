package Assignment3.EmployeePractise;

public class Director extends Manager {
    private double budget;

    public Director(int id, String name, String ssn, double salary, String deptName, double budget) {
        super(id, name, ssn, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
     void printEmployee()
    {
        System.out.println(super.getId());
        System.out.println(super.getName());
        System.out.println(super.getSsn());
        System.out.println(super.getSalary());
        System.out.println(getBudget());
    }
}

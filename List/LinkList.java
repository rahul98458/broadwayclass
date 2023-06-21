package List;

import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
    List<Employee> emp = new LinkedList<>();
    Employee obj1 = new Employee(1,"Ram", "Ktm");
    Employee obj2 = new Employee(2,"Ramesh", "chitwan");
    Employee obj3 = new Employee(3,"Rajesh", "pokhara");
    emp.add(obj1);
    emp.add(obj2);
    emp.add(obj3);

    for (Employee employee : emp) {
        System.out.println(employee);
    }
    }
}

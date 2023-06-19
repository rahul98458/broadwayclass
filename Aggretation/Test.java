package Aggretation;

public class Test {
    public static void main(String[] args) {
    Laptop lp1 = new Laptop("Apple", "macpro", 100000);
    Student st1 = new Student(1, "Ram", "Narayangarh", lp1);
    Laptop lp2 = new Laptop("Dell", "pro", 105000);
    Student st2 = new Student(2, "Ramesh", "KTM", lp2);
    System.out.println(st1);  // using tostring method
    System.out.println(st2);
    System.out.println(st1.getId()+" "+st1.getName()+" "+st1.getAddress()+" "+st1.getLp().getBrand()+" "+st1.getLp().getModel()+" "+st1.getLp().getPrice()); //using get method.
    System.out.println(st2.getId()+" "+st2.getName()+" "+st2.getAddress()+" "+st2.getLp().getBrand()+" "+st2.getLp().getModel()+" "+st2.getLp().getPrice());
    }
}

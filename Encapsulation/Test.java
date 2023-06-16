package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.setId(2);
        obj.setName("ram");
        System.out.println(obj);
       // System.out.println(obj.getId()+"  "+obj.getName());
    }
}

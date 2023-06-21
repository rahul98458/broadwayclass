package Inheritance;

public class Car extends Vehicle {
    private String company;
    private String geartype;
    public Car(String color, String size, String company, String geartype) {
        super(color, size);
        this.company = company;
        this.geartype = geartype;
    }
    void dispay()
    {
        run();
        System.out.println(company+" "+geartype+" "+getColor()+" "+getSize());
    }
    public static void main(String[] args) {
        Car c = new Car("red", "meduim", "mahindra", "automated");
        c.dispay();
            System.out.println(c);
    }
    @Override
    public String toString() {
        return "Car [company=" + company + ", geartype=" + geartype + "]";
    }
    
}

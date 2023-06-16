package Inheritance;

public class Vehicle {
    private String color;
    private String size;

    public Vehicle(String color, String size) {
        this.color = color;
        this.size = size;
    }
    void run()
    {
        System.out.println("applying accelerate");
    }
    void stop()
    {
        System.out.println("applying brake");
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
   
}

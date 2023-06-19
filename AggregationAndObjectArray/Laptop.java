package AggregationAndObjectArray;

public class Laptop {
     private String brand;
    private String model;
    private int price;
    public Laptop(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", model=" + model + ", price=" + price + "]";
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

package AggregationAndObjectArray;

public class StudentDetail {
    private int id;
    private String name;
    private String address;
    private Laptop lappy;
    public StudentDetail(int id, String name, String address, Laptop lappy) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.lappy = lappy;
    }
    public StudentDetail(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Laptop getLappy() {
        return lappy;
    }
    public void setLappy(Laptop lappy) {
        this.lappy = lappy;
    }
    @Override
    public String toString() {
        return "StudentDetail [id=" + id + ", name=" + name + ", address=" + address + ", lappy=" + lappy + "]";
    }
}

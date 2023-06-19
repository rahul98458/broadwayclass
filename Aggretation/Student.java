package Aggretation;

public class Student {
    private int id;
    private String name;
    private String address;
    private Laptop lp;
    public Student(int id, String name, String address, Laptop lp) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.lp = lp;
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
    public Laptop getLp() {
        return lp;
    }
    public void setLp(Laptop lp) {
        this.lp = lp;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", address=" + address + ", lp=" + lp + "]";
    }
}

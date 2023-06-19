package Assi;

public class Bookkk {
    private String name;
    private String author;
    private int price;
    public Bookkk(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Bookkk [name=" + name + ", author=" + author + ", price=" + price + "]";
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}

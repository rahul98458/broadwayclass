package OOP;

public class Rectangle {
    int length;
    int breadth;

    void displayArea()
    {
        int a = length*breadth;
        System.out.println("area = "+a);
    }
    void displayPerimeter()
    {
        int p = 2*(length+breadth);
        System.out.println("perimetr = "+p);
    }
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.length=5;
        obj.breadth=4;
        obj.displayArea();
        obj.displayPerimeter();

         Rectangle obj2 = new Rectangle();
        obj2.length=3;
        obj2.breadth=2;
        obj2.displayArea();
        obj2.displayPerimeter();
    }
}

package OOP;



public class Triangle {
     int side1;
    int side2;
    int side3;

    void displayArea()
    {
        float a = (1/2f)*side1*side2;
        System.out.println("area = "+a);
    }
    void displayPerimeter()
    {
        int p = side1+side2+side3;
        System.out.println("perimetr = "+p);
    }
    public static void main(String[] args) {
         Triangle obj = new Triangle();
        obj.side1=2;
       obj.side2=3;
       obj.side3=5;
        obj.displayArea();
        obj.displayPerimeter();
    
    }
}

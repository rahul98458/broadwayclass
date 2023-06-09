package Controlstatement.Selection.If;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int lenght;
        int breadth;
        int area;
        Scanner sca = new Scanner(System.in);
        System.out.println("enter length");
        lenght=sca.nextInt();
        System.out.println("enter breadth");
        breadth=sca.nextInt();
        sca.close();
        if(lenght!=0 && breadth !=0){
        area=lenght*breadth;
        System.out.println("the area is "+area);
        }
        else
        {
            System.out.println("either length or breadth value is 0");
        }
    }
    
}

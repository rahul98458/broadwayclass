package Controlstatement.Jumping;

public class Return {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
            return;    // it directly return controller to the out of method.. 
            }
            System.out.println(i);
        }
        System.out.println("end loop");
    }
    
}

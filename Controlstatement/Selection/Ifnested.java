package Controlstatement.Selection;

public class Ifnested {
    public static void main(String[] args) {
        String citizen="nepali";
        int age=15;
        if(citizen.equals("nepali"))
        {
            if(age>18)
            {
                System.out.println("yes u can vote");
            }
            else
            {
                System.out.println("age not applicable");
            }
        }
        else
        {
            System.out.println("non-nepali");
        }
    }
    
}

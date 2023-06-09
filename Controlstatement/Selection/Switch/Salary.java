package Controlstatement.Selection.Switch;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        
        System.out.println("Enter Post");
        Scanner scanner = new Scanner(System.in);
        String post = scanner.nextLine();
        scanner.close();
        String post1=post.toUpperCase();

        switch(post1)
        {
            case "MD" :
            int mbsalary = 359000;
            float mbonus= 0.2067f;
            float mtsalary = mbsalary + (mbonus*mbsalary);
            System.out.println("Basic salary is "+ mbsalary);
            System.out.println("Bonus % is 20.67%");
             System.out.println("Total Salary is "+mtsalary);
            break;
    
            case "CEO" :
            int cbsalary = 234000;
            float cbonus= 0.18f;
            float ctsalary = cbsalary + (cbonus*cbsalary);
            System.out.println("Basic salary is "+ cbsalary);
            System.out.println("Bonus % is 18%");
             System.out.println("Total Salary is "+ctsalary);;
            break;
    
            case "MANAGER" :
            int mabsalary = 187000;
            float mabonus= 0.1788f;
            float matsalary = mabsalary + (mabonus*mabsalary);
            System.out.println("Basic salary is "+ mabsalary);
            System.out.println("Bonus % is 17.88%");
             System.out.println("Total Salary is "+matsalary);;
            break;

            case "HELPER" :
            int hbsalary = 127809;
            float hbonus= 0.11f;
            float htsalary = hbsalary + (hbonus*hbsalary);
            System.out.println("Basic salary is "+ hbsalary);
            System.out.println("Bonus % is 11%");
             System.out.println("Total Salary is "+htsalary);;
            break;
    
            default :
            System.out.println("wrong post entry");
        }
    }
}

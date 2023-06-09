package Controlstatement.Looping;

public class For {
    public static void main(String[] args) {
        int sume=0;
        int sumo=0;
        int totalsum;
        for(int i=1;i<=100;i++)
        {
         if(i%2==0)
         {
            sume=sume+i;
         }
         else
         {
            sumo=sumo+i;
         }
            
        }
        totalsum=sume+sumo;
        System.out.println("The even sum from 1 to 100 is "+sume);
        System.out.println("The odd sum from 1 to 100 is "+sumo);
        System.out.println("The total sum from 1 to 100 is "+totalsum);
    }
}

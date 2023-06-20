package Abstraction.AbstractClass;

public class PrimeBank extends CentralBank {

    @Override
    void bname() {
        System.out.println("prime bank");
    }

    @Override
    void intrate() {
       System.out.println("10%");
    }
    
}

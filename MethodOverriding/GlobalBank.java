package MethodOverriding;

public class GlobalBank extends CentralBank{
    @Override
    protected void bname() {
        System.out.println("Global Bank");
    }
    @Override
    protected void intrate() {
        System.out.println("10%");
    }
    @Override
    public void exrate() {
        super.exrate();
    }
}

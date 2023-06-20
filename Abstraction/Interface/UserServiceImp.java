package Abstraction.Interface;

public class UserServiceImp implements UserService,CommonService{

    @Override
    public void addDetails() {
        System.out.println("added");
    }

    @Override
    public void deleteDetails() {
       System.out.println("deleted");
    }

    @Override
    public void print() {
      System.out.println("common service");
    }

    @Override
    public void againprint() {
         System.out.println("common service 2");
    }

    
}

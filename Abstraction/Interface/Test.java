package Abstraction.Interface;

public class Test {
    public static void main(String[] args) {
        UserServiceImp obj = new UserServiceImp();   
        obj.addDetails();
        obj.deleteDetails();
        obj.print();
        obj.againprint();

        UserService obj1 = new UserServiceImp(); //bothh are same in this case we are giving parent class name or interface clsss name.
        obj1.addDetails();
        obj1.deleteDetails();
        // obj1.print();
        // obj1.againprint();

    }
}

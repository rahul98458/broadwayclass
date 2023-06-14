package Constructor;

public class User {
    String userName;
    String password;
    User()
    {
        this.userName="test";
        this.password="123";
    }
    
    User(String userName,String password)
    {
        this.userName=userName;
        this.password=password;
    }

    void display()
    {
        System.out.println("username = "+userName);
        System.out.println("password = "+password);
    }
    public static void main(String[] args) {
        User u1 = new User("Hello","2580");
        u1.display();
    }
}

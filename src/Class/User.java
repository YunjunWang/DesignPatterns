package Class;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name);
    }
}

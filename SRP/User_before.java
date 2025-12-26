public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void saveUser() {
        System.out.println("Saving user to database");
    }

    public void printUser() {
        System.out.println("User name: " + name);
    }
}

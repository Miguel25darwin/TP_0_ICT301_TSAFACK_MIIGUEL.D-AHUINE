public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class UserPrinter {
    public void print(User user) {
        System.out.println("User name: " + user.getName());
    }
}

class UserRepository {
    public void save(User user) {
        System.out.println("Saving user to database");
    }
}

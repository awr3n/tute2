import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    public AuthenticationService() {
        users = new ArrayList<>();
        users.add(new User("defaultUsername", "defaultPassword")); // Add default user
    }

    @Override
    public User signUp(String username, String password) {
        // Check if the username is already taken
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return null; // Username already taken
            }
        }

        // Create and add the new user
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    @Override
    public User logIn(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // Return user if credentials match
            }
        }
        return null; // Return null if no user matches the credentials
    }
}

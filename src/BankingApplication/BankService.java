package BankingApplication;

import java.util.ArrayList;
import java.util.List;

public class BankService {

    private List<User> users = new ArrayList<>();

    public BankService() {
        users.add(new User("vaishnavi", "1234", "D Vaishnavi", 5000));
        users.add(new User("rahul", "1111", "Rahul Kumar", 8000));
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)
                    && user.checkPassword(password)) {
                return user;
            }
        }
        return null;
    }
}
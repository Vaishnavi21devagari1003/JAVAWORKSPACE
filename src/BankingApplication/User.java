package BankingApplication;

public class User {

    private String username;
    private String password;
    private String fullName;
    private double balance;

    private static final double MIN_BALANCE = 500;

    public User(String username, String password, String fullName, double balance) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        }

        if ((balance - amount) < MIN_BALANCE) {
            throw new InsufficientBalanceException(
                    "Minimum balance of ₹500 must be maintained!"
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful!");
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void editProfile(String newName) {
        this.fullName = newName;
        System.out.println("Profile updated successfully!");
    }

    public void changePassword(String oldPass, String newPass) {
        if (this.password.equals(oldPass)) {
            this.password = newPass;
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Incorrect old password.");
        }
    }

    public void showProfile() {
        System.out.println("Username: " + username);
        System.out.println("Full Name: " + fullName);
    }
}
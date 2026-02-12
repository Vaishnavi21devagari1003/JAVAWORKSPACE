package BankingApplication;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        System.out.println("===== Welcome to Bank System =====");

        System.out.print("Enter Username: ");
        String username = sc.next();

        System.out.print("Enter Password: ");
        String password = sc.next();

        User currentUser = service.login(username, password);

        if (currentUser == null) {
            System.out.println("Invalid credentials!");
            return;
        }

        System.out.println("Login successful!");

        while (true) {

            System.out.println("\nPlease select the option");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check balance");
            System.out.println("4. Edit profile");
            System.out.println("5. Change password");
            System.out.println("6. EXIT");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    currentUser.deposit(amt);
                }

                case 2 -> {
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();

                    try {
                        currentUser.withdraw(amt);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                case 3 -> currentUser.checkBalance();

                case 4 -> {
                    sc.nextLine();
                    System.out.print("Enter new full name: ");
                    String newName = sc.nextLine();
                    currentUser.editProfile(newName);
                }

                case 5 -> {
                    System.out.print("Enter old password: ");
                    String oldPass = sc.next();
                    System.out.print("Enter new password: ");
                    String newPass = sc.next();
                    currentUser.changePassword(oldPass, newPass);
                }

                case 6 -> {
                    System.out.println("Thank you for using our bank!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid option.");
            }
        }
    }
}
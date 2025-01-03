import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "RAM";  // predefined correct username
        String correctPassword = "0713";  // predefined correct password
        String enteredUsername, enteredPassword;
        boolean isLoggedIn = false;

        do {
            System.out.println("Welcome to Malla Reddy University!");
            System.out.println("Please enter your credentials:");

            System.out.print("Username: ");
            enteredUsername = scanner.nextLine();

            System.out.print("Password: ");
            enteredPassword = scanner.nextLine();

            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("You're logged in.");
                isLoggedIn = true;
            } else {
                System.out.println("Login Credentials are incorrect.");
            }

        } while (!isLoggedIn);

        scanner.close();
    }
}

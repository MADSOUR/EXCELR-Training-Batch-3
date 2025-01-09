import java.util.Scanner;

public class Demo005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "user";
        String correctPassword = "password";

        while (true) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Hello World");
                break;
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }

        sc.close();
    }
}
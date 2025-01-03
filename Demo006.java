import java.util.Scanner;

public class Demo006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "RAM";
        String correctPassword = "0713";

        while (true) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Hello Ram welcome to Malla Reddy University");
                break;
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }

        sc.close();
    }
}
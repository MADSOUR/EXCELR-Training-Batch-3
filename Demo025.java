import java.util.Scanner;

public class Demo025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversedString = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }
}

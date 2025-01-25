import java.util.Scanner;

public class Demo049 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            int reversed = 0;
            while (number != 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }

            System.out.println("Reversed number: " + reversed);
        }
    }
}
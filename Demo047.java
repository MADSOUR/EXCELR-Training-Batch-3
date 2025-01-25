import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            int count = 0;
            while (number != 0) {
                number /= 10;
                count++;
            }

            System.out.println("Number of digits: " + count);
        }
    }
}
import java.util.Scanner;

public class FactorialDemo {

    // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number to find its factorial: ");
        int n = scanner.nextInt();

        // Calling factorial method
        int result = factorial(n);

        System.out.println("Factorial of " + n + " is: " + result);

        scanner.close(); // Good practice to close Scanner
    }
}



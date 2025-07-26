/*
 * Algorithm:
Input decimal number n
Repeat until n > 0:
Divide n by 2
Store remainder (0 or 1)
Update n = n / 2
Reverse the collected remainders
Print as binary
 */

 /*
  * function convertToBinary(n):
    create empty string binary
    while n > 0:
        remainder = n % 2
        binary = remainder + binary
        n = n / 2
    return binary

  */

  import java.util.Scanner;

public class DecimalToBinary {

    // Function to convert decimal to binary
    public static String convertToBinary(int n) {
        String binary = ""; // to store the binary digits

        // Keep dividing the number by 2 and add remainders
        while (n > 0) {
            int remainder = n % 2;          // Get remainder (0 or 1)
            binary = remainder + binary;    // Add to front of binary string
            n = n / 2;                       // Reduce number
        }

        // If input was 0, return "0"
        if (binary.equals("")) {
            return "0";
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();

        // Calling the function to convert
        String binary = convertToBinary(number);

        // Display result
        System.out.println("Binary representation: " + binary);

        scanner.close();
    }
}


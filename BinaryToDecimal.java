/* 
* ✅ Algorithm Steps:
Take binary number input as an integer (like 1011)
Start from the rightmost digit
For each digit:
Multiply it by 
2
position
2 
position
Add it to a total
Increase position by 1 each time
Repeat until binary number becomes 0
 */

 /*
  * function binaryToDecimal(binary):
    decimal = 0
    position = 0

    while binary > 0:
        lastDigit = binary % 10
        decimal = decimal + (lastDigit * (2^position))
        binary = binary / 10
        position = position + 1

    return decimal

  */

import java.util.Scanner;

public class BinaryToDecimal {

    // Function to convert binary to decimal
    public static int convertBinaryToDecimal(int binary) {
        int decimal = 0;
        int position = 0;

        // Loop until all binary digits are processed
        while (binary > 0) {
            int lastDigit = binary % 10; // Get the rightmost digit
            decimal += lastDigit * Math.pow(2, position); // Multiply by 2^position
            binary /= 10; // Remove the last digit
            position++;   // Move to next position
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take binary input from the user
        System.out.print("Enter a binary number: ");
        int binaryInput = sc.nextInt();

        // Call the function to convert
        int result = convertBinaryToDecimal(binaryInput);

        // Print the result
        System.out.println("Decimal value: " + result);

        sc.close();
    }
}


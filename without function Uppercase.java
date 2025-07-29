import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();        // Read the whole line from user
        sc.close();                          // Close the scanner

        String upperStr = input.toUpperCase(); // Convert string to uppercase
        System.out.println("Uppercase: " + upperStr); // Print result
    }
}


/*
Enter a string : 
my name is abhishek
Uppercase : MY NAME IS ABHISHEK

=== Code Execution Successful ===
*/

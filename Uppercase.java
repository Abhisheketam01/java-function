import java.util.Scanner;

public class Uppercase {

    // Function to convert string to uppercase
    static String toUpper(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        String upperStr = toUpper(input);
        System.out.println("Uppercase: " + upperStr);
    }
}

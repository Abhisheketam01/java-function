Question 1 : Write a Java method to compute the average of three numbers..
Question 2 : Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.
Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321.
Question 4 : READ & CODE EXERCISE
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( )
Free reading resource (https://www.javatpoint.com/java-math)
Please feel free to look for more resources/websites on your own.
Question 5 :
Write a Java method to compute the sum of the digits in an integer.
(Hint : Approach this question in the following way :
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0 )


ChatGPT said:
Updated saved memory
Great! Let’s tackle each of these beginner-level Java function-based questions one by one. 🧠✍️

✅ Question 1: Compute the average of three numbers
Code:

java
Copy
Edit
public class AverageCalculator {

    // Method to calculate average of three numbers
    public static double computeAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double avg = computeAverage(10, 20, 30);
        System.out.println("Average: " + avg);
    }
}
✅ Question 2: Check if a number is even
Code:

java
Copy
Edit
public class EvenChecker {

    // Method to check even number
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 8;
        if (isEven(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
✅ Question 3: Check if a number is a Palindrome
Code:

java
Copy
Edit
public class PalindromeChecker {

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}
✅ Question 4: Math class methods usage
java
Copy
Edit
public class MathMethodsDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Sqrt of 25: " + Math.sqrt(25));
        System.out.println("2^3 = " + Math.pow(2, 3));
        // Math.avg() does not exist; use custom average
        System.out.println("Average: " + ((a + b) / 2.0));
        System.out.println("Absolute of -10: " + Math.abs(-10));
    }
}
✅ Question 5: Sum of digits of an integer
Code:

java
Copy
Edit
public class DigitSumCalculator {

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum of digits: " + sumOfDigits(num));
    }
}

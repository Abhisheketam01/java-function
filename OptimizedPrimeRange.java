import java.util.Scanner;

public class OptimizedPrimeRange {
    // Optimized method to check if number is prime or not

    public static boolean checkPrime(int n) {

        if (n <= 1) return false;

        for (int i =2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0)
             return false;
            }
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from the user
        System.out.println("Enter the upper limit to print prime number: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + "are");

        for (int i = 1; i <= n; i++) {

            if(checkPrime(i)) {
                System.out.println(  i + " ");
            }
        }

        sc.close();

    }        
}



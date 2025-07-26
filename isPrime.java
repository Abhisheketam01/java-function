import java.util.Scanner;

public class isPrime {

    //Function to check if number is prime
    public static boolean checkPrime(int n){
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }

        // special case for 2 (smallest prime)
        if(n == 2) {
            return true;
        }

        //Check divisibility from 2 to n-1
        for (int i=2; i < n; i++) {
            if (n % i == 0){
                return false; //Not a prime
            }
        }
        return true; //prime
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //Check and display result
        if(checkPrime(num)){
            System.out.println("the given number is prime: " + num);

        } else {
            System.out.println("The given number is not prime: " + num);
        }
        sc.close();
    }
}

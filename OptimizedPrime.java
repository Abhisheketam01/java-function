import java.util.Scanner;

public class OptimizedPrime {

    //optimized solution to check if number is prime or not
    public static boolean checkPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if( n % i == 0) {
                return false; //Not a prime
            }
        }
        return true; //Prime
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking input from the user
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        
        //Check and display result
        if(checkPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime");
        }
        sc.close();

    }
}

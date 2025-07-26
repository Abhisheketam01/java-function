import java.util.Scanner;

public class BinomialCoefficient {
    //Method to calculate factorial

    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
    //Method to calculte nCr
    public static int CalculateNCR(int n, int r) {
        return factorial(n) / (factorial(r)*factorial(n-r)) ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a value of n: ");
        int n = sc.nextInt();

        System.out.println("Enter a value of r: ");
        int r = sc.nextInt();

        //validating input
        if(n < r){
            System.out.println("Invalid input: n should be greater than r");
        } else {
            int result = CalculateNCR(n, r);
            System.out.println("Binomial coefficient of (nCr) is : " + result);
        }

        sc.close();

    }
    
}

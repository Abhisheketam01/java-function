import java.util.Scanner;


public class SumOverLoading {

    //Method 1 : sum of 2 numbers
    public static int sum(int a, int b){
        return a + b;
    }

    //Method 2: sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // Asking user how many inputs to add 
        System.out.println("Enter number of vlaues to add (2 or 3): ");
        int count = sc.nextInt();

        int result = 0;

        if(count == 2) {
            System.out.println("Enter value of a: ");
            int a = sc.nextInt();
            System.out.println("Enter value of b: " );
            int b = sc.nextInt();

            result = sum(a, b); //Calling 2-args version
            System.out.println("The sum of a and b is : " + result);
        } else if(count == 3) {
            System.out.println("Enter value of a: ");
            int a = sc.nextInt();
            System.out.println("Enter value of b: ");
            int b = sc.nextInt();
            System.out.println("Enter value of c: ");
            int c = sc.nextInt();

            result = sum(a, b, c); //calls 3-arg version
             System.out.println("Sum = " + result);
        } else {
            System.out.println("Invalid output please enter (2 or 3)");
        }
        sc.close();
    } 
}

import java.util.Scanner;

public class AddOverLoad {

    public static int add(int a, int b){
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //Integer input 
         System.out.println("Enter int value of a: ");
         int inta = sc.nextInt();
         System.out.println("Enter second value b: ");
         int intb = sc.nextInt();
         
         int intresult = add(inta, intb);
         System.out.println("Sum of integers of a and b is : " + intresult);

         System.out.println();

         //float input
         System.out.println("Enter float value of a: ");
         float floata = sc.nextFloat();
         System.out.println("Enter float value of b: ");
         float floatb = sc.nextFloat();

         float FloatResult = add(floata, floatb);
         System.out.println("sum of float of a and b: " + FloatResult);

         sc.close();

    }
    
}

/* 
 Enter int value of a: 
2
Enter second value b: 
3
Sum of integers of a and b is : 5

Enter float value of a: 
3.14
Enter float value of b: 
3.14
sum of float of a and b: 6.28

=== Code Execution Successful ===
 */
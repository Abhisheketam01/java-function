public class ProductDemo {

    // Method to calculate product of two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;

        System.out.println("Original values:");
        System.out.println("a = " + a + ", b = " + b);

        // Calling the multiply method
        int result = multiply(a, b);

        System.out.println("Product of a and b = " + result);
    }
}


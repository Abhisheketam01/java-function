public class SwapDemo {

    // Method to swap two numbers (Call by Value)
    public static void swap(int a, int b) {
        System.out.println("\nInside swap method:");
        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swapping logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        // Original values
        int a = 10;
        int b = 20;

        System.out.println("Original values in main:");
        System.out.println("a = " + a + ", b = " + b);

        // Calling the swap method
        swap(a, b);

        System.out.println("\nValues in main after calling swap method:");
        System.out.println("a = " + a + ", b = " + b);
    }
}

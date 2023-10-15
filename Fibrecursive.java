public class Fibrecursive {
    public static void main(String[] args) {
        int n = 15; // The number of Fibonacci numbers to generate

        System.out.println("Fibonacci Series up to " + n + " numbers:");
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

public class Fibo {
    public static void main(String[] args) {
        int n = 3; // Change n to the desired number of Fibonacci numbers
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c=a+b;
            a=b;
            b=c;
        }

        return b;
    }
}

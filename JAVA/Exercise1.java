// import java.util.*;
// class Exercise1{
//     public static void main(String[] args){
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       int a=0,b=1,c=0;
//       System.out.println(a+"\n"+b);
//       for(int i=3;i<=n;i++){
//         c=a+b;
//         a=b;
//         b=c;
//         System.out.println(c);
//       }
      
//     }
// }
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

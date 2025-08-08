import java.util.Scanner;
public class FibonacciSeries {
    public static int fib(int n) {
            if (n == 0) {
                return 0;
            }
            else if (n == 1) {
                return 1;
            }
            else {
                return fib(n - 1) + fib(n - 2);
            }
        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the num:");
        int n=s.nextInt();
        System.out.println("Fibonacci Series:");
        for(int i=0;i<=n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}



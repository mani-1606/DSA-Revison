import java.util.Scanner;

public class FibonacciSeries {
    public int fibo(int n) {
        if (n == 0 || n == 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find fibonacci : ");
        int n = sc.nextInt();
        FibonacciSeries f = new FibonacciSeries();
        System.out.println(f.fibo(n));
    }
}
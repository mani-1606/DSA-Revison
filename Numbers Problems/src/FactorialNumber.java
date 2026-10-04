import java.util.Scanner;

public class FactorialNumber {
    public int Factorial(int n){ // using recursion
        if(n==0) return 1;
        return n* Factorial(n-1);
    }
    public int NonRecursive(int n){
        int f =1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find's it factorial: ");
        int n = sc.nextInt();
        FactorialNumber f = new FactorialNumber();
        System.out.println(f.Factorial(n));
        System.out.println(f.NonRecursive(n));
    }
}

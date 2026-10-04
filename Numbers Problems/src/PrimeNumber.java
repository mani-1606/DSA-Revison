import java.util.Scanner;

public class PrimeNumber {
    public boolean isPrime(int n){
        if(n <=1 ) return false;
        for(int i=2; i<n; i++){
            if(n % i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not: ");
        int n = sc.nextInt();
        PrimeNumber p = new PrimeNumber();
        System.out.println(p.isPrime(n));
    }
}

import java.util.Scanner;

public class PalindromeNumber {
    public boolean palindrome(int n){
        int x = n;
        int rev = 0;
        while(n!=0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return (x==rev);
    }
    public static void main(String[] args){
        PalindromeNumber p = new PalindromeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome or not: ");
        int n = sc.nextInt();
        System.out.println(p.palindrome(n));
    }
}

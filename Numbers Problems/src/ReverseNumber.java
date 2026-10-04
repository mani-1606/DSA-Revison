import java.util.Scanner;

public class ReverseNumber {
    public int reverse(int x){
        int n = x;
        int rev = 0;
        while(n!=0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int n = sc.nextInt();
        ReverseNumber re = new ReverseNumber();
        System.out.println(re.reverse(n));
    }
}

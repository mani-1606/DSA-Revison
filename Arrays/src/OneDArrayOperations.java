import java.util.Scanner;

public class OneDArrayOperations {
 public static void main(String[] args){
     int[] arr = new int[5];
     Scanner sc = new Scanner(System.in);
     int n = arr.length;
     for(int i=0; i<=n; i++){
         arr[i] = sc.nextInt();
     }
     System.out.println(arr);
 }

}

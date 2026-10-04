import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
       ArrayList< ArrayList<Integer>> AL = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(40);
        l2.add(50);
        l2.add(60);

        AL.add(l1);
        AL.add(l2);
        System.out.println(AL);
        System.out.println("Reading:"+AL.get(1).get(2));
        AL.get(1).set(1,100);
        System.out.println(AL);
        AL.get(1).remove(2);
        System.out.println(AL);
        System.out.println(AL.toArray().toString());
        // Display(arr);
        //DisplayForeach(arr);
    }

    public static void Display(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void DisplayForeach(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Collections;
import java.util.PriorityQueue;

public class SecondLargInArray {
    public static void main(String[] args){
        int[] a = {99,102,87,55,22,54};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : a) pq.add(i);
        pq.remove();
        System.out.println(pq.peek());
    }
}

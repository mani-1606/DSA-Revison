import java.util.Arrays;
import java.util.HashMap;
//lc = 1
public class TwoSum {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<= nums.length; i++){
            int diff = t-nums[i];
            if(map.containsKey(diff)) return new int[]{map.get(diff),i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public int[] bruteForce(int[] nums, int t){
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j]==t) return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int t=18;
        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(nums,t)));
        System.out.println(Arrays.toString(ts.bruteForce(nums, t)));
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
//Lc = 217
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i],i );
        }
        return false;
    }
    public boolean bruteforce(int[] nums){
        Arrays.sort(nums);
        for(int i=1; i< nums.length; i++){
            if(nums[i]==nums[i-1]) return true;
        }
        return false;
    }
    public boolean optimized(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
    public static  void main (String[] args){
        int[] nums = {1,2,3,1};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.optimized(nums));
    }
}

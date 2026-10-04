public class MaxSubArray {
    //lc=53
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i : nums){
            currsum+=i;
            if(currsum > maxsum) maxsum=currsum;
            if(currsum < 0) currsum=0;
        }
        return maxsum;
    }
}

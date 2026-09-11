class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currmax = nums[0];
        for(int i=1; i<nums.length;i++){
            currmax = Math.max(currmax + nums[i], nums[i]);
            max = Math.max(currmax,max);

        }
        return max;
        
    }
}
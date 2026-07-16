class Solution {
    public int[] leftRightDifference(int[] nums) {
       // int n=nums.length;
        int res[] =new int[nums.length];
        int left=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
        res[i]=Math.abs(left-(sum-left-nums[i]));
        left+=nums[i];
        }
        return res;
        
    }
}
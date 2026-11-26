class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return max/k;
        // int n=nums.length;
        // double max=0;
        // for(int i=0;i<=n-k;i++){
        //     double curr=0;
        //     for(int j=i;j<i+k;j++){
        //         curr+=nums[j];
        //     }
        //     max=Math.max(max,curr);
        // }
        // return max/k;

        
    }
}
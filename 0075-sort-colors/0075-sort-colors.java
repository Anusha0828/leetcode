class Solution {
    public void sortColors(int[] nums) {
        int zeroes=0,ones=0,twos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroes++;
            }else if(nums[i]==1){
                ones++;
            }else{
                twos++;
            }
        } 
        int index=0;
        while(zeroes>0){
            nums[index++]=0;
            zeroes--;
        } 
        while(ones>0){
            nums[index++]=1;
            ones--;
        } 
        while(twos>0){
            nums[index++]=2;
            twos--;
        }      
    }
}
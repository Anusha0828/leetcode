class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int[] arr=new int[nums.length];
        // int i=0;
        // int position =0;
        // int j=n;
        // while(j<nums.length){
        //     arr[position++]=nums[i++];
        //     arr[position++]=nums[j++];


        // }
        // return arr;
        int[] arr=new int[nums.length];
        int index=0;
        for(int i=0;i<n;i++){
            arr[index++]=nums[i];
            arr[index++]=nums[i+n];
        }
        return arr;
        
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(hm.containsKey(val)){
                int c=hm.get(val);
                hm.put(val,c+1);
                if(c+1>nums.length/2){
                    return val;
                }
            }else{
                hm.put(val,1);
                if(1>nums.length/2){
                    return val;
                }
            } 
        }
        return -1;

        
    }
}
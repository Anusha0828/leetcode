class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(hm.containsKey(val)){
                int c=hm.get(val);
                count=count+c;
                hm.put(val,c+1);

            }else{
                hm.put(val,1);
            }
        }
        return count;
        
    }
}
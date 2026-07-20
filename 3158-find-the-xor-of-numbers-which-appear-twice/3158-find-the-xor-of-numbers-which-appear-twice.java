class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:nums){
            if(hm.containsKey(val)){
                hm.put(val,hm.get(val)+1);
            }else{
                hm.put(val,1);
            }
        }
        int xor=0;
        for(int key:hm.keySet()){
            if(hm.get(key)==2){
                xor^=key;
            }
        }
        return xor;
        
    }
}
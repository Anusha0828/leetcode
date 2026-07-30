class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int right=0;
        int len=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        while(right<fruits.length){
            hm.put(fruits[right],hm.getOrDefault(fruits[right],0)+1);
            if(hm.size()>2){
                hm.put(fruits[left],hm.get(fruits[left])-1);
                if(hm.get(fruits[left])==0)
                hm.remove(fruits[left]);
                left++;
            }
            len=Math.max(len,right-left+1);
            right++;
        }
        return len;
        
    }
}
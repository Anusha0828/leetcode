class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // int count=0;
        // for(int i=0;i<jewels.length();i++){
        //     char ch1=jewels.charAt(i);
        //     for(int j=0;j<stones.length();j++){
        //         char ch2=stones.charAt(j);
        //         if(ch1==ch2){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        HashMap<Character,Integer>hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(hm.containsKey(ch)){
                int c=hm.get(ch);
                hm.put(ch,c+1);
            }else{
                hm.put(ch,1);
            }

        }
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if(hm.containsKey(ch)){
                 ans = ans + hm.get(ch);
            }
        }
        return ans;

        
    }
}
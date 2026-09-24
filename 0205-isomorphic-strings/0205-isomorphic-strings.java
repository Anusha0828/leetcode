class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        boolean ans=true;
        for(int i = 0; i < s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!hm1.containsKey(ch1) && !hm2.containsKey(ch2)){
                hm1.put(ch1, ch2);
                hm2.put(ch2, ch1);
            }else if(hm1.containsKey(ch1) && hm1.get(ch1)!=ch2){
                    ans=false;
                    break;
            }else if(hm2.containsKey(ch2) && hm2.get(ch2)!=ch1){
                ans=false;
                break;
            }
        }
        return ans;
    }
}
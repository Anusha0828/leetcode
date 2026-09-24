class Solution {
    public String decodeMessage(String key, String message) {
        char alphabets='a';
        HashMap<Character,Character>hm=new HashMap<>();
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!=' ' && !hm.containsKey(ch)){
                hm.put(ch,alphabets);
                alphabets++;
            }
        }
        String res="";
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch==' '){
                res=res+ch;
            }else{
                res=res+hm.get(ch);
            }
        }
        return res;
        
    }
}
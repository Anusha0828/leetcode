class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isUpperCase(ch)){
                res+=(char)(ch+32);
            }else{
                res+=ch;
            }

        }
        return res;
        
    }
}
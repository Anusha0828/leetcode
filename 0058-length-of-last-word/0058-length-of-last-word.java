class Solution {
    public int lengthOfLastWord(String s) {
        // s=s.trim();
        // int lastindex=s.lastIndexOf(' ');
        // String lastWord=s.substring(lastindex+1);
        // return lastWord.length();
        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }else{
                count++;
            }
        }
        return count;
    }
}
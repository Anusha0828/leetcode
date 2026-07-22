class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int lastindex=s.lastIndexOf(' ');
        String lastWord=s.substring(lastindex+1);
        return lastWord.length();
    }
}
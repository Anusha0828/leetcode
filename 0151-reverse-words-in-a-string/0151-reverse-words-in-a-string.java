class Solution {
    public String reverseWords(String s) {
         s = s.trim().replaceAll("\\s+", " ");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        StringBuilder res = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != ' ') {
                word.append(sb.charAt(i));
            } else {
                res.append(word.reverse());
                res.append(" ");
                word.setLength(0);
            }
        }

        res.append(word.reverse());

        return res.toString();
    }
}
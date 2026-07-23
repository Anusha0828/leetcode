import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for(String word:strs){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sortedWord1=new String(arr);
            if(hm.containsKey(sortedWord1)){
                hm.get(sortedWord1).add(word);

            }else{
                List<String>lis=new ArrayList<>();
                lis.add(word);
                hm.put(sortedWord1,lis);
            }
        }
          return new ArrayList<>(hm.values());
    }
}
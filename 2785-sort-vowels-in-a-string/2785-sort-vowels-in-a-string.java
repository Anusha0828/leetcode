class Solution {
    public static boolean isVowel(char ch){
        return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                list.add(ch);       
        }
    }
    // for(int i=0;i<list.size()-1;i++){
    //     for(int j=0;j<list.size()-1;j++){
    //         if(list.get(j)>list.get(j+1)){
    //             char temp = list.get(j);
    //             list.set(j, list.get(j+1));
    //             list.set(j+1, temp);
    //         }
    //     }
    // }
    Collections.sort(list);
    int index=0;
    StringBuilder res=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(isVowel(ch)){
            res.append(list.get(index));
            index++;
        }else{
            res.append(ch);
        }
    }
    return res.toString();
        
    }
}
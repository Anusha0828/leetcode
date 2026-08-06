class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer>hm=new HashMap<>();
       char[] arr=s.toCharArray();
       for(int i=0;i<s.length();i++){
        if(hm.containsKey(arr[i])){
            hm.put(arr[i],hm.get(arr[i])+1);
        }else{
            hm.put(arr[i],1);
        }
       } 
       PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
       pq.addAll(hm.entrySet());
       StringBuilder res=new StringBuilder();
       while(!pq.isEmpty()){
        Map.Entry<Character,Integer>map=pq.poll();
        for(int i=0;i<map.getValue();i++){
            res.append(map.getKey());
        }

       }
       return res.toString();
    }
}
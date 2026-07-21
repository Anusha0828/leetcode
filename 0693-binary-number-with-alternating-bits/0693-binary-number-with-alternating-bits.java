class Solution {
    public boolean hasAlternatingBits(int n) {
        ArrayList<Integer>lis=new ArrayList<>();
        while(n>0){
            int dig=n%2;
            lis.add(dig);
            n=n/2;
        }
        for(int i=1;i<lis.size();i++){
            if(lis.get(i-1)==lis.get(i)){
                return false;
            }

        }
        return true;
        
    }
}
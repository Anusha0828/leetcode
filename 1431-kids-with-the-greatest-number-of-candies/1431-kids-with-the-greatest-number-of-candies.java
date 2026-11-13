class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
       List<Boolean>bb=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int sum=candies[i]+extraCandies;
            if(sum>=max){
                bb.add(true);
            }else{
                bb.add(false);
            }

        }
        return bb;
        
    }
}
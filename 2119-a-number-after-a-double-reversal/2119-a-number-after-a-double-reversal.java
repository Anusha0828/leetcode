class Solution {
    public boolean isSameAfterReversals(int num) {
        // int temp=num;
        // int rev=0;
        // if(num==0){
        //     return true;
        // }
        // while(num>0){
        //     int digit=num%10;
        //     rev=rev*10+digit;
        //     num=num/10;

        // }
        // int rev1=0;
        // while(rev!=0){
        //     int digit=rev%10;
        //     rev1=rev1*10+digit;
        //     rev=rev/10;
        // }
        // if(temp==rev1){
        //     return true;
        // }
        // return false;
        return num==0 || num%10!=0;
        
    }
}
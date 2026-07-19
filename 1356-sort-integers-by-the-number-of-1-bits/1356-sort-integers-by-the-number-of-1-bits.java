class Solution {
    public static int count(int n){
        int c=0;
        while(n>0){
        if((n&1)==1){
            c++;
        }
        n=n>>1;
        }
        return c;
    }
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                int count1=count(arr[j]);
                int count2=count(arr[j+1]);
                if(count1>count2){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }else if (count1 == count2 && arr[j] > arr[j + 1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
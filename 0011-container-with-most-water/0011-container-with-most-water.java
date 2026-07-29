class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int left=0,right=height.length-1;
        while(left<right){
            int high=Math.min(height[left],height[right]);
            int breadth=(right-left);
            int area=high*breadth;
            maxarea=Math.max(maxarea,area);  
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
    }
        
        return maxarea;
    }
}
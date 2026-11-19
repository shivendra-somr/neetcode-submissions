class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while(l<r){
            int area = 0;
            if(heights[l] > heights[r]){
                area = (r-l)* heights[r];
                r--;
            }
            else{
                area = (r-l)* heights[l];
                l++;
            }
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}

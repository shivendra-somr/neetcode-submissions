class Solution {
    public int rob(int[] nums) {
        int c1 = 0, c2 = 0;
        for(int i: nums){
            int temp = c2;
            c2 = Math.max(c1+i, c2);
            c1 = temp;
        }
        return c2;
    }
}

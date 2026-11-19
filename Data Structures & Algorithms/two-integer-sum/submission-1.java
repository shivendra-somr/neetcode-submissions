class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        if(nums.length == 2 && nums[0]+nums[1] == target){
            ans[0] = 0;
            ans[1] = 1;
        }
        else{
            int l = 0, r = 1;
        
            while(l<r && l<nums.length){
                while(r<nums.length){
                    if(nums[l] + nums[r] == target){
                        ans[0] = l;
                        ans[1] = r;
                        break;
                    }
                    r++;
                }
                l++;
                r = l+1;
            }
        }
        
        return ans;
    }
}

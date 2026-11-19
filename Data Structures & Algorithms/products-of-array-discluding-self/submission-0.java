class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int zeroes = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                zeroes++;
            }
        }
        if(zeroes > 1){
            for(int i=0; i<n; i++){
                nums[i] = 0;
            }
            return nums;
        }
        else{
            int[] ans = new int[n];
        
            for(int i=0; i<n ; i++){
                int p = 1;
                for(int j = 0; j<n ; j++){
                    if (i != j){
                        p *= nums[j];
                    }
                }
                ans[i] = p;
            }
            return ans;
        }
    }
}  

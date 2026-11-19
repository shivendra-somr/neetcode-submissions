class Solution {
    public int bs(int[] nums, int l, int r, int target){
        while(l <= r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > nums[r]){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l < r){
            int mid = l + (r-l)/2;

            if(nums[mid] > nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }

        r = nums.length - 1;
        
        if(nums[l] == target){
            return l;
        }
        else if(nums[l] <= target && nums[r] >= target){
            return bs(nums, l , r, target);
        }
        else {
            return bs(nums, 0, l -1, target);
        }

    }
}

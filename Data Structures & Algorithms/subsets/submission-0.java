class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        generateSubsets(nums, res, new ArrayList<>(), 0);

        return res;
    }

    public void generateSubsets(int[] nums, List<List<Integer>> res, 
                                    List<Integer> subset, int index){
        
        res.add(new ArrayList<>(subset));

        for(int i = index; i < nums.length; i++){
            subset.add(nums[i]);

            generateSubsets(nums, res, subset, i+1);

            subset.remove(subset.size() - 1);
        }
    }
}

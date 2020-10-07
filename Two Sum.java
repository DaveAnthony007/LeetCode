class Solution {

    private int [] solution2(int [] nums, int target) {
        int [] res = new int[2];
        int temp = -1;
        for(int i = 0; i < nums.length; i++) {
            // if(nums[i] > target) {
            //     continue;
            // }
            for(int j = i+1; j < nums.length; j++) {
                temp = nums[i] + nums[j];
                if(temp == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
    
    public int[] twoSum(int[] nums, int target) {
        // return solution1(nums, target);
        return solution2(nums, target);
    }
}
class Solution {
    
    private void solution1(int [] nums, int k) {
        int [] res = new int[nums.length];
        int temp = -1;
        for (int i = 0; i < nums.length; i ++) {
            temp = (i+k)%nums.length;
            res[temp] = nums[i];
        }
        System.arraycopy(res, 0, nums, 0, res.length);
    }
    
    public void rotate(int[] nums, int k) {
        solution1(nums, k);
    }
}
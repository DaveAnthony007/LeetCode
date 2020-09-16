class Solution {
    
    private int solution1(int [] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i ++) {
            if(map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[1]) + 1);
            }
        }
        for(int i = 0; i < nums.length; i ++) {
            if(map.get(nums[i]) == 1) res = nums[i];
        }
        return res;
    }
    
    public int singleNumber(int[] nums) {
        return solution1(nums);
    }
}
class Solution {
    
    private int solution1(int [] nums) {
        int index = 0;
        
        for(int i = 0; i < nums.length; i ++) {
            if(i == 0) {
                continue;
            }
            
            
            if(nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
    
    public int removeDuplicates(int[] nums) {
        return solution1(nums);
    }
}
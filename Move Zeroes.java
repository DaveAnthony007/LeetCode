class Solution {
    
    private void solution1(int [] nums) {
        List<Integer> temp = new ArrayList<>();
        
        for(int x : nums) {
            if(x != 0) {
                temp.add(x);
            }
            
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(i < temp.size()) {
                nums[i] = temp.get(i);
            }
            else {
                nums[i] = 0;
            }
        }
    }
    
    public void moveZeroes(int[] nums) {
        solution1(nums);
    }
}
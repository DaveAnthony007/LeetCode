class Solution {
    
    private boolean solution1(int[] nums) { // runtime 12ms
        HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i ++) {
            if(visited.get(nums[i]) != null && i > 0) return true;
            visited.put(nums[i], i);
        }
        return false;
    }
    
    public boolean solution2(int[] nums) { // runtime 9ms
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
    
    public boolean containsDuplicate(int[] nums) {
        return solution2(nums);
    }
}
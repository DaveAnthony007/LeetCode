class Solution {
    
    private List<Integer> solution1(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int n = nums.length;
        int nTarget = n/3;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashSet<Integer> blacklistSet = new HashSet<Integer>();
        
        for(int x : nums) {
            if(blacklistSet.contains(x)) {
                continue;
            }
            else if(map.get(x) == null) {
                map.put(x, 1);
            }
            else if(map.get(x) != null) {
                map.put(x, map.get(x) + 1);
            }
            
            if(map.get(x) > nTarget) {
                res.add(x);
                blacklistSet.add(x);
            }
        }
        
        // for(Map.Entry<Integer, Integer> set : map.entrySet()) {
        //     if(set.getValue() > nTarget) {
        //         res.add(set.getKey());
        //     }
        // }
        
        return res;
    }
    
    private List<Integer> solution2(int [] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = nums.length;
        int nTarget = n/3;
        Integer major1=0, major2=0;
        Integer count1, count2;
        count1 = 0;
        count2 = 0;
        
        int count = 1;
        for(int x : nums) {
            if(major1 == x) {
                count1++;
            }
            else if(major2 == x) {
                count2++;
            }
            else if(count1 <= 0) {
                major1 = x;
                count1 = 1;
            }else if(count2 <= 0) {
                major2 = x;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
//             System.out.println("major1: " + major1 + " - " + count1);
//             System.out.println("major2: " + major2 + " - " + count2);
//             System.out.println(count + " ================================");
            
//             count ++;
        }
        count1 = count2 = 0;
        for(int x : nums) {
            if(x == major1) {
                count1++;
            }
            else if(x == major2) {
                count2++;
            }
        }
        if(count1 > nTarget) {
            res.add(major1);
        }
        if(count2 > nTarget) {
            res.add(major2);
        }
        
        return res;
    }
    
    public List<Integer> majorityElement(int[] nums) {
        // return solution1(nums);
        return solution2(nums); // optimized
    }
}
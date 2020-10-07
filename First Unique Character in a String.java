class Solution {
    
    private int solution2(String s) {
        if(s.length() < 1) return -1;
        int [] temp = new int[26];
        for(int i = 0; i < s.length(); i ++) {
            temp[s.charAt(i) - 'a'] ++;
        }
        for(int i = 0; i < s.length(); i ++) {   
            if(temp[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
    
    public int firstUniqChar(String s) {
        // return solution1(s);
        return solution2(s);
    }
}
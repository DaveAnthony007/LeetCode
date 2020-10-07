class Solution {
    
    private boolean solution1(String s, String t) {
        int [] alpha = new int [26];
        if(s.length() != t.length()) return false;
        
        for(int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a'] ++;
        }
        for(int i = 0; i < t.length(); i++) {
            alpha[t.charAt(i) - 'a'] --;
        }
        for(int i = 0; i < alpha.length; i++) {
            if(alpha[i] > 0) return false;
        }
        return true;
    }
    
    public boolean isAnagram(String s, String t) {
        return solution1(s, t);
    }
}
class Solution {
    
    private int solution1(String s) {
        int res = s.length();
        String [] splitted = s.split(" ");
        res = (splitted.length == 0)?0:splitted[splitted.length - 1].length();
        return res;
    }
    
    public int lengthOfLastWord(String s) {
        return solution1(s);
    }
}
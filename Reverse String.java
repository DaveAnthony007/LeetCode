class Solution {
    
    private void solution1(char[] s) {
        char temp;
        int n = s.length;
        for(int i = 0; i < n/2; i++) {
            temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }
    
    public void reverseString(char[] s) {
        solution1(s);
    }
}
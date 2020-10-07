class Solution {
    
    private int solution1(int x) {
        int temp = 0;
        do {
            try {
                temp = Math.multiplyExact(temp, 10);    
            } catch(Exception e) {
                return 0;
            }
            
            temp = temp + x % 10;
            x = x / 10;
            
        } while(x != 0);
        return temp;
    }
    
    public int reverse(int x) {
        return solution1(x);
    }
}
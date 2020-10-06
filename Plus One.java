
class Solution {
    
    private int [] solution2(int [] digits) {
        int [] tempArr = new int[digits.length+1];
        int count = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                break;
            }
            else if(i == 0) {
                digits[i] = 0;
                tempArr[count] = 1;
                count++;
            }
            else {
                digits[i] = 0;
            }
        }
        
        if(count != 0) {
            for(int i = count; i < tempArr.length; i++) {
                tempArr[i] = digits[i-1];
            }
            return tempArr;
        }
        return digits;
    }
    
    public int[] plusOne(int[] digits) {
        // return solution1(digits);
        return solution2(digits);
    }
}
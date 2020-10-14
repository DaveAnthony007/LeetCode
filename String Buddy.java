class Solution {

//     private boolean solution1(String A, String B) {
//         String tempA = "";
//         String tempB = "";
//         char temp = ' ';
        
//         if(A.length() != B.length()) return false;
//         for(int i = 0; i < A.length(); i ++) {
//             for(int j = i+1; j < B.length(); j ++) {
//                 if(j >= B.length()) break;
//                 char [] arrA = A.toCharArray();
//                 // swap
//                 temp = arrA[i];
//                 arrA[i] = arrA[j];
//                 arrA[j] = temp;
                
//                 tempA = String.valueOf(arrA);
                
//                 if(tempA.equals(B)) return true;
//             }
//         }
//         return false;
//     }
    
    private boolean solution2(String A, String B) {
        if(A.length() != B.length()) return false;
        
        if(A.equals(B)) {
            HashSet <Character> set = new HashSet<>();
            for(int i = 0; i < A.length(); i ++) {
                if(set.contains(A.charAt(i))) return true;
                set.add(A.charAt(i));
            }
            return false;
        }
        
        
        int countDiff = 0;
        int [] tempIdx = new int[5];
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) != B.charAt(i)) {
                tempIdx[countDiff] = i;
                countDiff ++;
                if(countDiff > 2) return false;
            }
        }
        
        // swap
        char temp = ' ';
        char [] arr = A.toCharArray();
        temp = arr[tempIdx[0]];
        arr[tempIdx[0]] = arr[tempIdx[1]];
        arr[tempIdx[1]] = temp;
        
        if(String.valueOf(arr).equals(B)) return true;
        return false;
    }
    
    public boolean buddyStrings(String A, String B) {
        // return solution1(A, B); // time limit
        return solution2(A, B);
        
    }
}
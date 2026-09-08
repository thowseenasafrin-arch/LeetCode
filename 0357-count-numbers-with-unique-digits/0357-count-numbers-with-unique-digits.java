class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        
        int result = 10;        
        int uniqueDigits = 9;    
        int available = 9;       
        
        for (int k = 2; k <= n && k <= 10; k++) {
            uniqueDigits *= available;
            result += uniqueDigits;
            available--;
        }
        
        return result;
    }
}
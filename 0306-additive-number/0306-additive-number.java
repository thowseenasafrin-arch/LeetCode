import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) break; 
            for (int j = i + 1; n - j >= Math.max(i, j - i); j++) {
                if (num.charAt(i) == '0' && j - i > 1) break; 
                BigInteger a = new BigInteger(num.substring(0, i));
                BigInteger b = new BigInteger(num.substring(i, j));
                if (check(num, j, a, b)) return true;
            }
        }
        return false;
    }

    private boolean check(String num, int start, BigInteger a, BigInteger b) {
        while (start < num.length()) {
            BigInteger sum = a.add(b);
            String s = sum.toString();
            if (!num.startsWith(s, start)) return false;
            start += s.length();
            a = b;
            b = sum;
        }
        return true;
    }
}
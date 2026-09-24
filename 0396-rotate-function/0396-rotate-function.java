class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        long f0 = 0; 

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            f0 += (long) i * nums[i];
        }

        long maxF = f0;
        long prev = f0;


        for (int k = 1; k < n; k++) {
            long curr = prev + totalSum - (long) n * nums[n - k];
            maxF = Math.max(maxF, curr);
            prev = curr;
        }

        return (int) maxF;
    }
}
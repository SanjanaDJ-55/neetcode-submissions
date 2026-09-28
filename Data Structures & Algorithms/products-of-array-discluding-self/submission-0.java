class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int product = 1;
        int zeroCount = 0;

        // Find product and count zeros
        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product = product * nums[i];
            }
        }

        // More than one zero
        if (zeroCount > 1) {
            for (int i = 0; i < n; i++) {
                result[i] = 0;
            }
        }

        // Exactly one zero
        else if (zeroCount == 1) {
            for (int i = 0; i < n; i++) {

                if (nums[i] == 0) {
                    result[i] = product;
                } else {
                    result[i] = 0;
                }
            }
        }

        // No zero
        else {
            for (int i = 0; i < n; i++) {
                result[i] = product / nums[i];
            }
        }

        return result;
    }
}
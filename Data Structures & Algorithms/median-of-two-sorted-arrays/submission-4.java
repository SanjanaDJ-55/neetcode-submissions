

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1 + n2];
        
        for (int i = 0; i < n1; i++) {
            nums3[i] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            nums3[i + n1] = nums2[i];
        }
        
        int n3 = nums3.length;
        Arrays.sort(nums3);
        
        if (n3 % 2 == 0) {
            // FIX: Added parentheses around the sum and divided by 2.0 to avoid integer division
            return (nums3[(n3 / 2 - 1)] + nums3[(n3 / 2)]) / 2.0;
        } else {
            return nums3[n3 / 2];
        }
    }
}

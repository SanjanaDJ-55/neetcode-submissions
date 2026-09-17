class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int a = 0;
        int[] nums3 = new int[n1+n2];
        for(int i =0;i<n1;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            nums3[i+n1]=nums2[i];
        }
         Arrays.sort(nums3);

        int n = nums3.length;

        // Odd length
        if (n % 2 != 0) {
            return nums3[n / 2];
        }

        // Even length
        return (nums3[n / 2 - 1] + nums3[n / 2]) / 2.0;
    }
        
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int result[]=new int[n];
        //only one zero
        //No zero
        //more than one zero
        int zeroCount = 0;
        for(int i =0;i<n;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else{
                product = product*nums[i];
            }
        }
        //no zero
       if (zeroCount == 1) {
            for (int i = 0; i < n; i++) {

                if (nums[i] == 0) {
                    result[i] = product;
                } else {
                    result[i] = 0;
                }
            }
        }
        else if(zeroCount > 1){
              for(int i =0;i<n;i++){
                result[i] = 0;
        }
            
        }
       else {
            for (int i = 0; i < n; i++) {
                result[i] = product / nums[i];
            }
        }

        return result;

        }
}
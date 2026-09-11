class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i =0;i<n;i++){
        int com = target - nums[i];
        if(hm.containsKey(com)){
            return new int[]{hm.get(com), i};
        }
        hm.put(nums[i], i);
       }
       return new int[]{};


    }
}
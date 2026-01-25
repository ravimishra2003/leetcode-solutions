class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length<=1){
            return 0;
        }
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0; i+k-1<n; i++){
            int diff=nums[i+k-1]-nums[i];
            min=Math.min(min,diff);
        }
        return min;
    }
}
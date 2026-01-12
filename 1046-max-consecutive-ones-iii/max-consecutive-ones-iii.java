class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int maxLen=0;
        int left=0;
        int right=0;
        while(right<nums.length){
            if(nums[right]==0){
                zero++;
            }
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            if(zero<=k){
                int len=right-left+1;
                maxLen=Math.max(len,maxLen);
            }
            right++;
        }
        return maxLen;
    }
}
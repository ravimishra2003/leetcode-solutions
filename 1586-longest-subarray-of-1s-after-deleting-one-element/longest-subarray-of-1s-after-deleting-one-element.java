class Solution {
    public int longestSubarray(int[] nums) {
        int prev=0;
        int curr=0;
        int ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                curr++;
            }
            else{
                ans=Math.max(ans,curr+prev);
                prev=curr;
                curr=0;
            }
            ans=Math.max(ans,curr+prev);
        }
        if(ans==nums.length){
            ans=ans-1;
        }
        return ans;

    }
}


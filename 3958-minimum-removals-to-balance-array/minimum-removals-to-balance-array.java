class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int ans=0;
        while(j<nums.length){
            if(nums[j]<=(long)k*nums[i]){
                ans=Math.max(ans,j-i+1);
                j++;
            }
            else{
                i++;
            }
        }
        return nums.length-ans;
    }
}
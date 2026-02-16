class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int longest=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            int min=nums[i];
            int max=nums[i];
            for(int j=i; j<n; j++){
                min=Math.min(nums[j],min);
                max=Math.max(nums[j],max);
                if(max-min==1){
                    int len=j-i+1;
                    longest=Math.max(len,longest);
                }
            }
        }
        return longest;
    }
}
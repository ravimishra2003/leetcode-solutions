class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1,count=0;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                prod=prod*nums[i];
            }
            else{count++;}
        }
        if(count>1){return ans;}

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                if(count>0){
                    ans[i]=0;
                }
                else{ans[i]=prod/nums[i];}
            }
            else{
                ans[i]=prod;
            }
        }
        return ans;
    }
}
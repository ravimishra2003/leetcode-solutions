class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0;
        //ascending
        while(i+1<nums.length && nums[i]<nums[i+1]){
            i++;
        }
        if(i==0 || i==nums.length-1){
            return false;
        }
        //descending
        while(i+1<nums.length && nums[i]>nums[i+1]){
            i++;
        }
        if(i==nums.length-1){
            return false;
        }
        //ascending
        while(i+1<nums.length && nums[i]<nums[i+1]){
            i++;
        }
        return i==nums.length-1;
    }
}
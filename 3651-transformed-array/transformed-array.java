class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0; i<nums.length; i++){
            int num=(i+nums[i])%n;
            if(num<0){
                num=num+n;
            }
            arr[i]=nums[num];
        }
        return arr;
    }
}
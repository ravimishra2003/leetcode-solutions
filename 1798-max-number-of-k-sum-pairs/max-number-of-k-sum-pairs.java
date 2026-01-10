class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int target=k-nums[i];
            if(mp.containsKey(target)){
               count++;
               if(mp.get(target)==1){
                mp.remove(target);
               }
               else{
                mp.put(target,mp.get(target)-1);
               }
            }
            else{
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
}
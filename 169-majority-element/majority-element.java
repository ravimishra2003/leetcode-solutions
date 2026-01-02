class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer>mp =new HashMap<>();
        for(int i:nums){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else{
                mp.put(i,1);
            }
        }
        for(int x:nums){
            if(mp.get(x)>n/2){
                return x;
            }
        }
        return -1;
    }
}
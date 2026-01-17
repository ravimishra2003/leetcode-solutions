class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<Integer>();
        HashSet<Integer> set2=new HashSet<Integer>();
        for(int val:nums1){
            set1.add(val);
        }
        for(int val:nums2){
            set2.add(val);
        }
        List<Integer> list1=new ArrayList<>();
        for(int val:set1){
            if(!set2.contains(val)){
                list1.add(val);
            }
        }
        List<Integer> list2=new ArrayList<>();
        for(int val:set2){
            if(!set1.contains(val)){
                list2.add(val);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}
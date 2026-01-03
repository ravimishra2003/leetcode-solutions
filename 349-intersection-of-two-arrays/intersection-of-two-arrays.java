class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        List<Integer> l1=new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            if(set1.contains(nums2[i])){
                l1.add(nums2[i]);
                set1.remove(nums2[i]);
            }
        }
        int res[]=new int[l1.size()];
        int i=0;
        for(int num:l1){
            res[i++]=num;
        }
        return res;
    }
}
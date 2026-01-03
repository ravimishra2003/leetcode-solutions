class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        for(int num:nums1){
            l1.add(num);
        }
        List<Integer> l2=new ArrayList<>();
        for(int num:nums2){
            if(l1.contains(num)){
                l2.add(num);
                l1.remove((Integer)num);
            }
        }
        int res[]=new int[l2.size()];
        int i=0;
        for(int num:l2){
            res[i++]=num;
        }
        return res;
    }
}
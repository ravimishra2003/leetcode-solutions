class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+nums2.length];
        int i=0;
        for(int a:nums1){
            ans[i]=a;
            i++;
        }
        for(int a:nums2){
            ans[i]=a;
            i++;
        }

        Arrays.sort(ans);
        if(ans.length%2!=0){
            return ans[ans.length/2];
        }

       return (ans[ans.length/2]+ans[(ans.length/2)-1])/2.0;

        
    }
}
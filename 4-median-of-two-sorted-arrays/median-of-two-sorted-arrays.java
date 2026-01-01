class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(j<nums1.length && k<nums2.length){
            if(nums1[j]<nums2[k]){
                ans[i]=nums1[j];
                j++;
            }
            else{
                ans[i]=nums2[k];
                k++;
            }
            i++;

        }

        while(j<nums1.length){
            ans[i]=nums1[j];
            i++;
            j++;
        }

        while(k<nums2.length){
            ans[i]=nums2[k];
            i++;
            k++;
        }



        if(ans.length%2!=0){
            return ans[ans.length/2];
        }

       return (ans[ans.length/2]+ans[(ans.length/2)-1])/2.0;

        
    }
}
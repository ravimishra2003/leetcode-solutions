class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs=new HashSet<>();
        int max=0;
        int right=0;
        int left=0;
        int n=s.length();
        while(right<n){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                max=Math.max(hs.size(),max);
                right++;
            }
            else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
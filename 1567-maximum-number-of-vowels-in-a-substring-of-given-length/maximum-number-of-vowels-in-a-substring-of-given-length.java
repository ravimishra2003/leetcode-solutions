class Solution {
    public int maxVowels(String s, int k) {
        int cur=0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                cur++;
            }
        }
        int max=cur;
        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                cur--;
            }
            if(isVowel(s.charAt(i))){
                cur++;
            }
            max=Math.max(max,cur);
        }
        return max;
    }
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
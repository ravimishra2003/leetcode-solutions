class Solution {
    public int maxVowels(String s, int k) {
        int cur=0;
        char ch[]=s.toCharArray();
        for(int i=0; i<k; i++){
            if(isVowel(ch[i])){
                cur++;
            }
        }
        int max=cur;
        for(int i=k; i<ch.length; i++){
            if(isVowel(ch[i-k])){
                cur--;
            }
            if(isVowel(ch[i])){
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
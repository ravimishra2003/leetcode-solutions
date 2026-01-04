class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                char ch1=word1.charAt(i);
                s.append(ch1);
                i++;
            }
            if(j<word2.length()){
                char ch2=word2.charAt(j);
                s.append(ch2);
                j++;
            }
        }
        return s.toString();
    }
}
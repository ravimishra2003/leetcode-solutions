class Solution {
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int i=0; 
        int j=s.length()-1;
        while(i<=j){
            if(!isVowel(ch[i])){
                i++;
            }
            else if(!isVowel(ch[j])){
                j--;
            }
            else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
    boolean isVowel(char c) {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}
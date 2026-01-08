class Solution {
    public int compress(char[] chars) {
        int i=0;
        int idx=0;
        while(i<chars.length){
            int count=0;
            char ch=chars[i];
            while(i<chars.length && chars[i]==ch){
                count++;
                i++;
            }
            chars[idx++]=ch;
            if(count>1){
                char freq[]=Integer.toString(count).toCharArray();
                for(char c:freq){
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }
}
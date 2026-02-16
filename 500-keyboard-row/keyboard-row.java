class Solution {
    public String[] findWords(String[] words) {
        Set<Character> row1=new HashSet<>();
        Set<Character> row2=new HashSet<>();
        Set<Character> row3=new HashSet<>();

        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        char ch3[]=s3.toCharArray();

        for(char c: ch1){
            row1.add(c);
        }
        for(char c: ch2){
            row2.add(c);
        }
        for(char c: ch3){
            row3.add(c);
        }
        List<String> result=new ArrayList<>();
        for(String word: words){
            String lower=word.toLowerCase();
            Set<Character> row;
            if(row1.contains(lower.charAt(0))){
                row=row1;
            }
            else if(row2.contains(lower.charAt(0))){
                row=row2;
            }
            else{
                row=row3;
            }
            boolean valid=true;

            for(char c:lower.toCharArray()){
                if(!row.contains(c)){
                    valid=false;
                    break;
                }
            }
            if(valid){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);

    }
}
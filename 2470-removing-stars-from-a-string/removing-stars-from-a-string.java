class Solution {
    public String removeStars(String s) {
        char arr[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c:arr){
            if(c=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
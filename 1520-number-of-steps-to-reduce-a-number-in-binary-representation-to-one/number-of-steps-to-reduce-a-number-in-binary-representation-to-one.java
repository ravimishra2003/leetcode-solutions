class Solution {
    public int numSteps(String s) {
        int count=0;
        // int n=s.length();
        while(s.length()>1){
            int n=s.length();
            if(s.charAt(n-1)=='0'){
                s=s.substring(0,s.length()-1);
            }
            else{
                s=addone(s);
            }
            count++;
        }
        return count;
    }
    public static String addone(String s){
        StringBuilder sb=new StringBuilder(s);

        int i=sb.length()-1;
        while(i>=0 && sb.charAt(i)=='1'){
            sb.setCharAt(i,'0');
            i--;
        }
        if(i<0){
            sb.insert(0,'1');
        }
        else{
            sb.setCharAt(i,'1');
        }
        return sb.toString();
    }

}
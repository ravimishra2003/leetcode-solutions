class Solution {
    public int numSteps(String s) {
        int count=0;
        int carry=0;
        int n=s.length();
        for(int i=n-1; i>0; i--){
           if(s.charAt(i)-'0'+carry==1){
            count+=2;
            carry=1;
           } 
           else{
            count+=1;
           }
        }
        return count+carry;
    }
}
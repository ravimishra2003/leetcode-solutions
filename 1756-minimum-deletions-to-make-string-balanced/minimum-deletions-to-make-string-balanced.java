class Solution {
    public int minimumDeletions(String s) {
        int count=0;
        int ba=0;
        for(char ch: s.toCharArray()){
            if(ch=='b'){
                ba+=1;
            }
            else if(ba>0){
                ba-=1;
                count+=1;
            }
        }
        return count;
    }
}
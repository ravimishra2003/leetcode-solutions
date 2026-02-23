class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set1=new HashSet<>();
        for(int i=0; i<=s.length()-k; i++){
            String sub=s.substring(i,i+k);
            set1.add(sub);
        }
        return set1.size()==Math.pow(2,k);
    }
}
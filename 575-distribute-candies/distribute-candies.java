class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s1=new HashSet<>();
        int n=candyType.length;
        for(int i=0; i<n; i++){
            s1.add(candyType[i]);
        }
        if(n/2<s1.size()){
            return n/2;
        }
        return s1.size();
    }
}
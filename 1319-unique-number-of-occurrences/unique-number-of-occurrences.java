class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int val:arr){
            if(map1.containsKey(val)){
                map1.put(val,map1.get(val)+1);
            }
            else{
                map1.put(val,1);
            }
        }
        Set<Integer> check =new  HashSet<>();
        for(Integer a:map1.values()){
            if(check.add(a)){
                check.add(a);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
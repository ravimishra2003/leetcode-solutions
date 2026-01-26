class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> l1=new LinkedList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int i=0; i<arr.length-1; i++){
            List<Integer> sub=new ArrayList<>();
            
            if(arr[i+1]-arr[i]==min){
                sub.add(arr[i]);
                sub.add(arr[i+1]);
                l1.add(sub);
            }
        }
        return l1;
    }
}
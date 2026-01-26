class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> l1=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            int num=arr[i+1]-arr[i];
            if(num<min){
                min=num;
            }
        }
        // System.out.println(min);
        for(int i=0; i<arr.length-1; i++){
            List<Integer> sub=new ArrayList<>();
            int nums=Math.abs(arr[i]-arr[i+1]);
            if(nums==min){
                sub.add(arr[i]);
                sub.add(arr[i+1]);
            l1.add(sub);

            }
        }
        return l1;
    }
}
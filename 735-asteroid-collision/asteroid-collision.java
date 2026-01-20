class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int ast : asteroids){
            boolean destroyed=false;
            while(!st.isEmpty() && st.peek()>0 && ast<0){
                if(Math.abs(st.peek())< Math.abs(ast)){
                    st.pop();
                }
                else if(Math.abs(st.peek())==Math.abs(ast)){
                    st.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                st.push(ast);
            }
        }
        int arr[]=new int[st.size()];
        int i=0;
        for(Integer value: st){
            arr[i++]=value;
        }
        return arr;
    }
}
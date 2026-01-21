class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1=new Stack<>();
        Stack<StringBuilder> st2=new Stack<>();
        StringBuilder res=new StringBuilder();
        int num=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+c-'0';
            }
            else if(c=='['){
                st2.push(res);
                res = new StringBuilder();
                st1.push(num);
                num=0;
            }
            else if(c==']'){
                StringBuilder temp=res;
                res=st2.pop();
                int count=st1.pop();
                while(count>0){
                    res.append(temp);
                    count--;
                }
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
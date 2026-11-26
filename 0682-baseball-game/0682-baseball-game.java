class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            String s=operations[i];
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(2*st.peek());
            }
            else if(s.equals("+")){
                int top=st.pop();
                int secondtop=st.peek();
                int sum=top+secondtop;
                st.push(top);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int total=0;
        while(!st.isEmpty()){
            total+=st.pop();
        }
        return total;
    }
}
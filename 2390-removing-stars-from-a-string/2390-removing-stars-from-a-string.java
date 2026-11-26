class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='*'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return "";
                }
                else{
                    st.pop();
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
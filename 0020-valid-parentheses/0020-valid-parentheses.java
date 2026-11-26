class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='[' || c=='(' || c=='{'){
                st.push(c);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                char top=st.peek();
                if(sameStyle(top,c)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    static boolean sameStyle(char a ,char b){
        if(a=='[' && b==']'){
            return true;
        }
        if(a=='(' && b==')'){
            return true;
        }
        if(a=='{' && b=='}'){
            return true;
        }
        return false;
    }
}
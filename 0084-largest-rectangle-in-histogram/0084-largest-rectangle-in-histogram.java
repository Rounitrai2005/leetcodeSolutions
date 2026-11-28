class Solution {
    public int largestRectangleArea(int[] arr) {

        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if(!st.isEmpty()) {
                nse[i] = st.peek();
            }
            else {
                nse[i] = n;
            }
            st.push(i);
        }
        st.clear();
        int[] pse = new int[n];
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if(!st.isEmpty()) {
                pse[i] = st.peek();
            }
            else {
                pse[i] = -1;
            }
            st.push(i);
        }
        int maxArea = 0;
        for(int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
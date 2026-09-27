class Solution {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            while(start<end && !isVowel(arr[start])){
                start++;
            }
            while(start<end && !isVowel(arr[end])){
                end--;
            }
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
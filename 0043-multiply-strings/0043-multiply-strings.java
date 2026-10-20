class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int[] result=new int[num1.length() + num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int digit1=num1.charAt(i) -'0';
                int digit2=num2.charAt(j) -'0';
                int product=digit1*digit2;
                int sum=product+result[i+j+1];
                result[i+j+1]=sum%10;
                result[i+j]+=sum/10;    
            }
        }
        StringBuilder sb=new StringBuilder();
        int start=0;
        while(start<result.length && result[start]==0){
            start++;
        }
        for(int i=start;i<result.length;i++){
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
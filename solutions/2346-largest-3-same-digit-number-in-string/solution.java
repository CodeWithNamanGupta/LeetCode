class Solution {
    public String largestGoodInteger(String num) {
        int n = -1;
        for(int i = 0 ; i < num.length()-2 ; i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)){
                n = Math.max(n,num.charAt(i));
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append((char)n);
    }
    if(n==-1) return "";
    return builder.toString();
}
}

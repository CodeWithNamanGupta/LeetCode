class Solution {
    public int reverseDegree(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int sum = 0;
        for ( int i = 1 ; i <= s.length() ; i++){
            sum+= (26 - alpha.indexOf(s.charAt(i-1)))*i;
        }
        return sum;
    }
}
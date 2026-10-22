class Solution {
    public int maxScore(String s) {
        int one = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='1') one++;
        }
        int max = 0;
        int k =0;
        for(int i = 0 ; i < s.length()-1 ; i++){//s.length()-1 because minimum 1 space should be given to right substring
            if(s.charAt(i)=='0'){
                k++;
            }
            else{
                one--;
            }
            int sum = k+one;
            max = Math.max(sum,max);
        }
        return max;
    }
}

class Solution {
    public int maxPower(String s) {
        if(s.length()==1) return 1;
        int c = 1;
        int cmax = 0;
        for( int i = 1 ; i<s.length() ; i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else c = 1;
            cmax = Math.max(cmax,c);
        }
        return cmax;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int k = s.length();
        int i = 0;
        while(i<t.length()&&sp<s.length()){
            if(t.charAt(i)==s.charAt(sp)){
                k--;
                sp++;
            }
            i++;
        }
        if(k==0) return true;
        return false;
    }
}
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        int i = 0 ; 
        while (i<word1.length||i<word2.length){
            if(i<word1.length) s1 = s1+word1[i];
            if(i<word2.length) s2 = s2 + word2[i];
            i++;
        }
        return s1.equals(s2);
    }
}
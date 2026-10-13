class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length-1];
        int i = 0;
        for(; i < f.length() ; i++){
            if(f.charAt(i)!=l.charAt(i)) break;
        }
        return f.substring(0,i);
    }
}
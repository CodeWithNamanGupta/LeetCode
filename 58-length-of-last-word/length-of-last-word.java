class Solution {
    public int lengthOfLastWord(String s) {
        String result = s.stripTrailing();
        return result.length()-result.lastIndexOf(" ")-1;
    }
}
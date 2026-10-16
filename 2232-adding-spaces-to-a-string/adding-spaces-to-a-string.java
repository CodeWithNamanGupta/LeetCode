class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int i = 0;
        int right = 0;
        while(i<spaces.length){
            right = spaces[i];
            sb.append(s.substring(left,right)+" ");
            left = right;
            i++;
        }
        sb.append(s.substring(right,s.length()));
        return sb.toString();
    }
}
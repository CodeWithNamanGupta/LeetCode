class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int lastspace = s.lastIndexOf(' ');
        if(lastspace==-1) return s;
        StringBuilder sb = new StringBuilder(); 
        sb.append(s.substring(lastspace+1));
        while(lastspace>=0){
            int nextspace = s.lastIndexOf(' ', lastspace - 1);
            if(lastspace-nextspace == 1){
                lastspace = nextspace;
            }
            else{
                sb.append(" ");
                sb.append(s.substring(nextspace + 1, lastspace)); 
                lastspace = nextspace;
            }
        }
        return sb.toString();
    }
}
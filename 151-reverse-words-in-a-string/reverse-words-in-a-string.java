class Solution {
    public String reverseWords(String s) {
        s= s.trim();
        StringBuilder sb = new StringBuilder();
        int left = s.length()-1;
        int right = s.length()-1;
        while(left<=right&&left>=0){
            if(s.charAt(right)==' '){
                left--;
                right = left;
                continue;
            }
            if(s.charAt(left)!=' '){
                left--;
            }
            else {
                sb.append(s.substring(left+1,right+1)+' ');
                right = left;
            }
        }
        sb.append(s.substring(0,right+1));
        return sb.toString();
        /*s = s.trim();    O(N^2)
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
        return sb.toString();*/
    }
}
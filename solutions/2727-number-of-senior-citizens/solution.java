class Solution {
    public int countSeniors(String[] details) {
        int c =0;
        for(int i = 0 ; i < details.length ; i++){
            if(details[i].charAt(11)>'6'){
                c++;
            }
            else if(details[i].charAt(11)=='6'){
                if(details[i].charAt(12)>'0') c++;
            }
        }
        return c;
    }
}

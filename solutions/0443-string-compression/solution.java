class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int indx = 0;
        for(int i = 0 ; i < chars.length ;){
            char curr = chars[i];
            int count = 0;
            while(i<chars.length&&chars[i]==curr){
                i++;
                count++;
            }
            chars[indx] = curr;
            indx++;
            if(count>1){
                 for(char c : Integer.toString(count).toCharArray()){
                    chars[indx] = c;
                    indx++;
                 }
            }
        }
        return indx;
    }
}

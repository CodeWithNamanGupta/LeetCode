class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet <Character> set = new HashSet <>();
        for(int i = 0 ; i < allowed.length() ; i++){
            set.add(allowed.charAt(i));
        }
        int r = 0;
        for(int i = 0 ; i < words.length ; i++){
            boolean c = true;
            for(int k = 0 ; k < words[i].length() ; k++){
                if(set.contains(words[i].charAt(k))) continue;
                c = false;
                break;
            }
            if(c==true) r++; 
        }
        return r;
    }
}

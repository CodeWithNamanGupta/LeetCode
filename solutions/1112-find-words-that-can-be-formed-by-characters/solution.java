class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap <Character , Integer > map = new HashMap <>();
        for(int i = 0 ; i < chars.length() ; i++){
            if(map.containsKey(chars.charAt(i))){
                int freq = map.get(chars.charAt(i));
                map.put(chars.charAt(i),freq+1);
            }
            else map.put(chars.charAt(i),1);
        }
        int result = 0;
        for(int i = 0 ; i < words.length ; i ++){
            Map<Character, Integer> map2 = new HashMap<>(map);
            boolean c = true;
            for(int k = 0 ; k < words[i].length() ; k++){
                if(map2.containsKey(words[i].charAt(k))&&map2.get(words[i].charAt(k))!=0){
                    map2.put(words[i].charAt(k),map2.get(words[i].charAt(k))-1);
                }
                else{
                    c = false;
                    break;
                }
            }
            if(c==true) result+=words[i].length();
        }
        return result;
    }
}

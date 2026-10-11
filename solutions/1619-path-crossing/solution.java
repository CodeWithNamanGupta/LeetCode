class Solution {
    public boolean isPathCrossing(String path) {
        if(path.length()==1) return false;
        HashSet <String> set = new HashSet <>();
        int x = 0;
        int y = 0;
        set.add("0,0");
        for(int i = 0 ; i < path.length() ; i++){
            char s = path.charAt(i);
            if(s=='N') y++;
            else if( s == 'S') y--;
            else if(s=='E') x++;
            else x--;
            String pos = x+","+y;
            if(set.contains(pos)) return true;
            set.add(pos);
        }
        return false;
    }
}

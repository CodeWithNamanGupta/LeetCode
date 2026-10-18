class Solution {
    public int numUniqueEmails(String[] emails) {
       HashSet <String> set = new HashSet <>(); 
       for(int i = 0 ; i < emails.length ; i++){
        String [] bname = emails[i].split("@");//emails[i].split("@") returns a String[] array, not a single String
        String localn = bname[0].replace(".","");
        int j = localn.indexOf('+');
         if (j != -1) {
                localn = localn.substring(0, j);
            }
        set.add(localn + "@" + bname[1]);
    }
    return set.size();
    }
}

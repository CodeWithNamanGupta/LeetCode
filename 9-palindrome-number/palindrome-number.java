class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int rev=0;
        for(int i=x;i>0;i=i/10)
        {
            int d=i%10;
            rev=rev*10+d;
        }
        return x==rev;
    }
}

class Solution {
    public int reverse(int x) {
        int rev=0;
        for (int i=Math.abs(x);i>0;i=i/10)
        {
            int d=i%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }
            rev=rev*10+d;
            
        }
        if(x>0){
            return rev;
        }
        else{
            return -rev;
        }
    }
}
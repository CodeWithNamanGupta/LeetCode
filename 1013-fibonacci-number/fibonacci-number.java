class Solution {
    public int fib(int n) {
        int FT = 0;
        int ST = 1;
        for(int i = 1; i <= n; i++){
            int ThirdT = FT+ ST;
            FT = ST;
            ST = ThirdT;
        }
        return FT;
    }
}
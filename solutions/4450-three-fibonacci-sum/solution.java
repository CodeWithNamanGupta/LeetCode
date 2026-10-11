class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n==2) return true;
        if(n%2!=0) return false;
        int f1 = 1;
        int f2 = 1;
        while(f2<n/2){
            int sum2 = f1+f2;
            f1=f2;
            f2=sum2;
        }
        return f2==n/2;
    }
}

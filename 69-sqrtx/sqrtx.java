class Solution {
    public int mySqrt(int x) {
        if(x==1){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int left = 1 ;
        int right = x/2;
        int low = 0;
        while (left <= right){
            int mid = left+(right-left)/2;
            long num =(long) mid*mid;
            if(num==x){
                return mid;
            }
            else if(num<x){
                left = mid+1;
                low = mid;
            }
            else{
                right = mid-1;
            }
        }
        return low;
    }
}
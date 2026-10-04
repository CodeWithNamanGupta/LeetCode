class Solution {
    public boolean isPowerOfTwo(int n) {
        int maxPowerOf2 = 1073741824;
        return n>0 && maxPowerOf2%n==0;
    }
}
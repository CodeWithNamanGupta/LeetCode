class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int mA=0;
        while(l<r){
            int a=Math.min(height[l],height[r])*(r-l);
            if(a>mA){
                mA=a;
            }
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }

        }
        System.gc();
        return mA;
    }
}
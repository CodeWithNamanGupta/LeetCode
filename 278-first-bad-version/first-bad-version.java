/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1 ;
        int right = n;
        int min = 0;
        while (left<=right){
            int mid = left + (right-left)/2;
            boolean t = isBadVersion(mid);
            if (t==true){
                min = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return min;
    }
}
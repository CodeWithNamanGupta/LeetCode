class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int minx = m - 1;
        int ninx = n - 1;
        int ans = m + n - 1;
        while (ninx >= 0){
            if (minx >= 0 && nums1[minx] > nums2[ninx]){
                nums1[ans] = nums1[minx];
                minx--;
            }
            else {
                nums1[ans] = nums2[ninx];
                ninx--;
            }
            ans--;
        }        
    }
}
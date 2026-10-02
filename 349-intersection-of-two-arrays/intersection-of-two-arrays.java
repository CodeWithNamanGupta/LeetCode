class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set1 = new HashSet <>();
        HashSet <Integer> set2 = new HashSet <>();
        int i = 0;
        while(i<Math.max(nums2.length,nums1.length)){
            if(i<nums1.length){
                set1.add(nums1[i]);
            }
            if(i<nums2.length){
                set2.add(nums2[i]);
            }
            i++;
        }
        set1.retainAll(set2);
        int[] res = new int[set1.size()];
        int in = 0;
        for (int n : set1) {
            res[in] = n;
            in++;
        }
        return res;
    }
}
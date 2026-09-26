class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length-1;
        while ( left <= right ){
            int mid = (left+right)/2;//because range of numbers are less
            //arr[mid]-mid-1the numbers are in series hence if any 1 or multiple are missing it will give its number that is how many numbers are missing before it.
            if(arr[mid]-mid-1<k){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left+k;
    }
}
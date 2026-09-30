class Solution {
    public boolean validMountainArray(int[] arr) {
        int max = 0;
        if(arr.length<3){
            return false;
        }
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[max]<arr[i]) max = i;
            else if(arr[max]==arr[i]) return false;
        }
        if(max==arr.length-1||max==0) return false;
        for(int i = 1 ; i <arr.length-1 ; i++){
            if(i<=max&&arr[i]>arr[i-1]) continue;
            else if(i>max&&arr[i]>arr[i+1]) continue;
            else return false;
        }
        return true;
    }
}
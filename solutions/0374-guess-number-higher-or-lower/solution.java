/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1 ;
        int right = n ;
        while(left<=right){
            //int mid = (right+left)/2;
            /*Integer Overflow: With n = 2,126,753,390 (which is very close to INT_MAX), using (left + right) / 2 triggers an integer overflow. This leads to negative numbers, causing an infinite loop or a segmentation fault. The formula left + (right - left) / 2 completely avoids this bug.*/
            int mid = left+(right-left)/2;
            int result = guess(mid);
            if(result==0){
                return mid;
            }
            else if(result==1){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }
}

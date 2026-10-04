class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int maxP=0;
        while(right<prices.length){
            if (prices[left]<prices[right]){
                int tempP = prices[right]-prices[left];
                if(maxP<tempP){
                    maxP=tempP;
                }
            }
            else{
                left = right;
            }
            right++;
        }
        return maxP;
    }
}
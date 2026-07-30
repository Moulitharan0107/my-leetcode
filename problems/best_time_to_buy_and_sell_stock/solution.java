class Solution {
    public int maxProfit(int[] prices) {
        int k=0,max=0;
        for(int i=k+1;i<prices.length;i++){
            max=Math.max(max,prices[i]-prices[k]);
            if(prices[i]<prices[k]){
                k=i;
            }
        }
        return max;
    }
}
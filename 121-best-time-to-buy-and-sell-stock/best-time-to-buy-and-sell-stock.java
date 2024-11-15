class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)
        {
            return 0;
        }
        int result=Integer.MIN_VALUE;
        int value=prices[0];
        for(int i=1; i<prices.length; i++)
        {
            value=Math.min(value, prices[i]);
            
            result=Math.max(result, prices[i]-value);
            
        }
        return result;
    }
}
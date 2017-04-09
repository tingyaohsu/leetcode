public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int max = 0; 
        int input=prices[0];
        for(int i=1;i<prices.length;i++){
            if(input>prices[i])
                input = prices[i];
            if(input<prices[i]){
                max = Math.max(max,prices[i]-input);
            }
        }
        return max;
        
    }
}
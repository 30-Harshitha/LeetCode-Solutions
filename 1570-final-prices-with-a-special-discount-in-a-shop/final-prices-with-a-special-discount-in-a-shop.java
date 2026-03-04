class Solution {
    public int[] finalPrices(int[] prices) {
        int dif=0;
        int answer[]=new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {dif=prices[i];
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                    dif=prices[i]-prices[j];
                    break;
                }
                
            }
            answer[i]=dif;
        }
        return answer;
    }
}
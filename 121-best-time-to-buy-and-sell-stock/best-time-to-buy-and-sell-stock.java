class Solution {
    public static int maxProfit(int[] prices) {

        int bp=prices[0];
        int n=prices.length;
        int p=0;
        int maxp=Integer.MIN_VALUE;

        for(int i=0; i< n;i++){
            int curr=prices[i];
            
            if(curr<bp) bp=curr;

            p=curr-bp;
            maxp=Math.max(maxp,p);



            
        }
        if(maxp<0)return 0;
        return maxp;

        
    }
}
    
    
  
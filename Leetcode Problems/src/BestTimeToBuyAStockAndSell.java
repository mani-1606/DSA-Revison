public class BestTimeToBuyAStockAndSell {
    //lc=121
    public int maxProfit(int[] prices) {
     int bp = Integer.MAX_VALUE;
     int mp =0;
     for(int i : prices){
         if(bp< i){
             int profit= i-bp;
             mp = Math.max(mp, profit);
         } else {
             bp = i;
         }
     }
     return mp;
    }

}

package leetcode;

public class Test121 {
    public int maxProfit(int[] prices) {
        int flag = 0;
        int money = 0;
        for(int i = 0; i < prices.length-1 ;i++){
            for(int j = i+1 ; j<prices.length ;j++){
                money = prices[j]-prices[i];
                if(money > flag){
                    flag = money;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int max = new Test121().maxProfit(prices);
        System.out.println(max);

    }
}

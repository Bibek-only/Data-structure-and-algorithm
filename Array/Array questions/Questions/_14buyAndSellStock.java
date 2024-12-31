/*
 * find max profit
 * in this problem we given a arr which contain the proce of a stock in different day we need to find out what is the maximum profit we can make from the one stock
 */

public class _14buyAndSellStock {

    public static int findMaxProfit(int arr[]){
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = arr[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int ans = findMaxProfit(arr);
        System.out.println("the maximum profit we can make "+ans);

    }
}

import java.util.Stack;
class solution{
    public static void findSpan(int stocks[], int span[]){
       Stack<Integer> st = new Stack<>();
       span[0] = 1;
       st.push(0);

       for(int i = 1; i<stocks.length; i++){
            int currentPrice = stocks[i];
            while(!st.isEmpty() && currentPrice > stocks[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }else{
                int previosHighStockIndex = st.peek();
                span[i] = i - previosHighStockIndex;
            }
            st.push(i);
       }
    }
    public static void main(String args[]){
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        findSpan(stocks,span);
        for(int i = 0; i<stocks.length; i++){
            System.out.print(stocks[i]+" ");
            
        }
        System.out.println();
        for(int i = 0; i<span.length; i++){
            System.out.print(span[i]+" ");

        }
        System.out.println();

    }
}
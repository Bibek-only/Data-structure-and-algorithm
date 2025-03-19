import java.util.Stack;
class solution{
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> st = new Stack<>();
        int nextGreaterArr[] = new int[arr.length];
        

        for(int i = arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                if(arr[st.peek()] <= arr[i]){
                    st.pop();
                }
            }
            if(st.isEmpty()){
                nextGreaterArr[i] = -1;
            }
            else{
                nextGreaterArr[i] = arr[st.peek()];
            }
            st.push(i);
        }




        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.print(nextGreaterArr[i]+" ");

        }
        System.out.println();
    }
}
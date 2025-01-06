public class _03reverseStringFromSpace {
    public static void main(String[] args) {
        String str = "Bibek kumar mister samal";
       StringBuilder sb = new StringBuilder("");

        String arr[] = str.split(" ");

        
        int n = arr.length;

        for(int i = 0; i<n/2; i++){
            int fi = i;
            int li = n-i-1;

            String temp = arr[fi];
            arr[fi] = arr[li];
            arr[li] = temp;
        }


        for(int i = 0; i<arr.length; i++){
           sb.append(arr[i]+" ");
        }
       System.out.println(sb);
    }
}

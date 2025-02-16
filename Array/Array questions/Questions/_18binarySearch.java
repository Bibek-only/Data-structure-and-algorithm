class binarySearch{


    //take key, sorted arry, starting index and ending index  and retur the key index using binary search
    public static int findKey(int arr[], int key,int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid] == key ){
            return mid;
        }
        if(arr[mid] > key){
            return findKey(arr, key, si, mid-1);
        }
        if(arr[mid] < key){
           return findKey(arr, key, mid+1, ei);
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 5;
        int position = findKey(arr, key, 0, arr.length-1);
        System.out.println(position);
    }
}
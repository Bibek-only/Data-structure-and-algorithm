/**
 *  stpes to perform merge sort
 * step-1> devide the arr until we get the smallest unit (arr,si,ei)
 *      1.1-> first call for leftside (arr,si=si,ei=mid) 
 *      1.2-> sicond call for rightside (arr,si=mid+1,ei=ei)
 *      1.3-> base condition when we reached at the smallest unit, si>=ei
 * step2-> merge the arr (arr,si,mid,ei)
 *      2.1-> make a temporary arr with the size of combined size of left and rigt array (temArr len = ei-si+1)
 *      2.2 -> copy the left and right arr element to the temp arr with proper trackers
 * stope3-> copy the temporary array element to the original array
 * 
 */



public class _01meargeSort {

    // merge sort tech nique
    // devide function to devide the arr into smaller unit
    public static void devide(int arr[], int si, int ei) {
        if(arr.length == 1 || arr.length == 0){
            return;
        }

        // base condition to devide the arr
        if (si >= ei) {
            return;
        }

        // step 1 find the mid
        int mid = si + (ei - si) / 2;

        // step 2 call to divide the left part of the arr
        devide(arr, si, mid);

        // step 3 call to divide the right part of the arr
        devide(arr, mid + 1, ei);

        // setp 4 merge the array
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // create an temporary array to store the arr element
        int tempArr[] = new int[ei - si + 1];

        // track the arr element of left and right and copy the element to the temp arr
        int leftArrIndx = si;
        int rightArrIndx = mid + 1;
        int tempArrIndx = 0;

        // do the copy
        while (leftArrIndx <= mid && rightArrIndx <= ei) {
            // compare the left and right element
            if (arr[leftArrIndx] < arr[rightArrIndx]) {
                tempArr[tempArrIndx] = arr[leftArrIndx];
                leftArrIndx++;
                tempArrIndx++;
            } else {
                tempArr[tempArrIndx] = arr[rightArrIndx];
                tempArrIndx++;
                rightArrIndx++;
            }
        }

        // copy the whole left arr remaining index to temp arr
        while (leftArrIndx <= mid) {
            tempArr[tempArrIndx] = arr[leftArrIndx];
            tempArrIndx++;
            leftArrIndx++;
        }

        // copy the whole right arr remaining index to temp arr
        while (rightArrIndx <= ei) {
            tempArr[tempArrIndx] = arr[rightArrIndx];
            tempArrIndx++;
            rightArrIndx++;
        }

        // copy the whole temp arr to the original array
        for (tempArrIndx = 0, leftArrIndx = si; tempArrIndx < tempArr.length; tempArrIndx++, leftArrIndx++) {
            arr[leftArrIndx] = tempArr[tempArrIndx];
        }
    }

    // print the function

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-----");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("|| ");
            }
            System.out.print(arr[i] + " || ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-----");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 2, 5, 4, 7, 8, 9, 6, 10 };
        printArr(arr);

        System.out.println();
        System.out.println();

        devide(arr, 0, arr.length - 1);

        printArr(arr);

    }

}
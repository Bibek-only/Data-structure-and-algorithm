import java.util.Arrays;

class merge{
    public static int[] merge(int arr1[], int arr2[]){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int mergedLen = len1 + len2;
        int mergedArray[] = new int[mergedLen];
        int i = 0, j= 0, k = 0;
        while(i<len1 && j<len2){ // copy the element to the merged array by comparing both the array
            if(arr1[i] < arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
                k++;
            }else{
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i<len1) { // copy app the element of arr1 to the merged array
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while(j<len2){ // copy all the element of the arr2 to the merged array
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;

    }
    public static void main(String args[]){
        int arr1[] = {1,4,6};
        int arr2[] = {2,3,5};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
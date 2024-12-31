/**
 * _13findTrapingRainWater
 * in theis problem we given an arr of bars which are diferent or same is size and the arr fdoes not contain the -ve value, when rain come we need to calculate how many rain water the bars can contain
 * and for each bar the width will be 1;
 */
public class _13findTrapingRainWater {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted1(int arr[]) { //check the arr is sorted in assending orger or not
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
            }
        }

        return isSorted;
    }

    public static boolean isSorted2(int arr[]) { //check the arr is sorted i ndesending order or not
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                isSorted = false;
            }
        }

        return isSorted;
    }


    public static int findTrapedWater(int arr[]) {
        if (isSorted1(arr) || isSorted2(arr)) {
            return 0;
        }
        int trapedWater = 0;
        int leftMaxbar[] = new int[arr.length]; //define the array for store left max bar for each arr element
        int rightMaxbar[] = new int[arr.length]; //define the array for store right max bar for each arr element

        leftMaxbar[0] = arr[0]; //find the left max bar for each arr element
        int curentmaxLeft = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > leftMaxbar[i - 1]) {
                leftMaxbar[i] = arr[i];
                curentmaxLeft = arr[i];
            } else {
                leftMaxbar[i] = curentmaxLeft;
            }
        }

        rightMaxbar[arr.length - 1] = arr[arr.length - 1]; //find the right max bar for each arr element
        int curentmaxRight = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > rightMaxbar[i + 1]) {
                rightMaxbar[i] = arr[i];
                curentmaxRight = arr[i];

            } else {
                rightMaxbar[i] = curentmaxRight;

            }
        }

        for (int i = 0; i < arr.length; i++) { //find the trap water above each bar
            int minumumBar = (leftMaxbar[i] < rightMaxbar[i]) ? leftMaxbar[i] : rightMaxbar[i]; //find the minimum between the leftmaxbar and teh rightmax bar for each element

            int tempsum = (minumumBar - arr[i] <= 0) ? 0 : minumumBar - arr[i]; // find the traped water for each bar
            trapedWater += tempsum;
        }

        return trapedWater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int arr[] = {1,2,3,4,5,6,7,8,9};
        int ans = findTrapedWater(arr);
        System.out.println("the number of rain water it contain "+ans);

    }
}
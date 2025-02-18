class ratate {

    public static void printArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] arr){
        int temp[][] = new int[arr.length][arr.length];

        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                temp[j][arr.length-i-1] = arr[i][j];
            }
        }

        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                arr[i][j] = temp[i][j];
            }
        }

        
        
    }

    public static void main(String args[]) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printArr(arr);
        System.out.println();
        rotate(arr);
        printArr(arr);
    }
}
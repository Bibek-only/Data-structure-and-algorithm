class solution{    
    public static int maxArea(int[] height) {
        
        int si = 0;
        int ei = height.length-1;

        int maxWater = Integer.MIN_VALUE;
        while(si < ei){
            int currentWater = (ei-si) * (Math.min(height[si], height[ei])); // calculate the current water capacity
            
            if(maxWater < currentWater){ // update the max water capacity if the current is more
                maxWater = currentWater;
            }

            if(height[si] < height[ei]){ // update the pointers based on which one is small
                si++;
            }else{
                ei--;
            }
        }

        return maxWater;
    
    }
    public static void main(String args[]){
        int barHeights[] = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(barHeights);
        System.out.println("most watner the container can have =  "+ ans);
    }
}
// this is the brut forse approach where we calculate the amount of wanter in each and every possible bars then compare it to find out what is the most amount of water the bars can contains
// i = 0, i<len-1, i++
// j = i+1, j<len, j++
// 
class Solution {
    public static int maxArea(int[] height) {
        int len = height.length;
        int maxWaterCapacity = Integer.MIN_VALUE; // for the maximum wanter
        for(int i = 0; i<len-1; i++){
                int currentMax = Integer.MIN_VALUE; 
            for(int j = i+1; j<len; j++){
                int currentWaterCapacity = Math.min(height[i], height[j]) * (j - i);
                if(currentMax < currentWaterCapacity){
                    currentMax = currentWaterCapacity;
                }
            }

            if(maxWaterCapacity < currentMax){
                maxWaterCapacity = currentMax;
            }
        }
        return maxWaterCapacity;
    }
    public static void main(String args[]){
        int barHeights[] = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(barHeights);
        System.out.println("most watner the container can have =  "+ ans);
    }
}
class Solution {
    public int maxArea(int[] height) {

       int maxWater= Integer.MIN_VALUE;
       int currWater=1;
       int minHeight=0;

       int leftPoint=0;
       int rightPoint= height.length-1;

       while(rightPoint>leftPoint){
        minHeight= Math.min(height[rightPoint], height[leftPoint]);
        currWater=(rightPoint-leftPoint)*minHeight;
        maxWater= Math.max(maxWater,currWater);

       if(height[rightPoint]<height[leftPoint]){
         rightPoint--;
       }else{
       leftPoint++;
       }

       }
      
        return maxWater;
        
    }
}
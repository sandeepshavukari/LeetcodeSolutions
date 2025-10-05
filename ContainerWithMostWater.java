public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n=height.length;
        int max =0;
        int area;
        int i=0,j=n-1;
        while(i<j){
            area=(j-i) * Math.min( height[i] , height[j] );
            if(height[i]<height[j]) i++;
            else j--;
            if (area>max) max=area;
        }
        return max;
    }
}

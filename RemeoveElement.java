public class RemeoveElement { 
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = n-1, i = n-1, k = 0;
        for(; i>=0; i--){
            if(nums[i] == val){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t; 
                k++;
                j--;
            }
        }
        
        return n-k;
    } 
}

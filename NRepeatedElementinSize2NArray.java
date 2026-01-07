class NRepeatedElementinSize2NArray {
    
    public int repeatedNTimes(int[] nums) {
        if(nums[0]==nums[nums.length-1])    return nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]||nums[i]==nums[i+2])  return nums[i];
        }
        
        return nums[0];
    }
}

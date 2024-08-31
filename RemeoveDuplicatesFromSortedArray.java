class Solution {
    public int removeDuplicates(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=nums[a])
            {
                a++;
                nums[a]= nums[i];

            }
        }
        return a+1;

    }
}

/*The function removeDuplicates will update the input array nums to remove duplicates in-place.
The function uses a position, a, of the last unique element. Next, it iterates through array nums. 
Every time a new unique element (nums[i]) is found, the function will place it at the next position (nums[a + 1]). 
At the end, the function will return a + 1, which represents the number of unique elements until that time through the modified array.*/

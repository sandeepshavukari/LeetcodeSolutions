
class RemeoveDuplicates {
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

/*# Approach
Iterating the loop till the length if the array, while iterating the loop checking
whether the prsent element and the next element are same or not so that i initialized
a variable 'a' with 0, the a tracks the position of unique element in the array as the 
first iteration is checking nums[0] with nums[0] it never goes to the if condition then
the i is incremented and in the second iteration nums[0] is compared with nums[1] if again 
same number i increments a dont if not the a increments then when the nums are nort same we have to make 
change in the nums array by placing the unique elements one side by giving the nums[i] value to nums[a], 
at last we rturn a+1 because the first element is also to be cnsidered then the 
output is the elements that prints upto the retutned element size

# Complexity
- Time complexity:
O(n)
- Space complexity:
O(1)
*/

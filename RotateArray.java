class RotateArray {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    void reverse(int nums[],int s,int l)
    {
        while(s<l)
        {
            int t=nums[s];
            nums[s]=nums[l];
            nums[l]=t;
            s++;
            l--;
        }
    }
}

/*Intuition:
When you need to rotate an array by k positions, you can imagine that first half of the arrays have shifted to the second half and vice versa.
Rather than swapping each element at a time, you can perform the rotation by swapping portions of the list.
There is one concept tied to the idea of reversibility in particular With the help of it, one is able to shift elements in place effectively.

Approach:
Check if it makes sense for k to be appropriate as a size by simply reducing k = k% = n Hence, 
if the size of the array is 5 and k is 7, after 5 rotations, it will start from one again. Therefore,
k = 7 is equivalent to k = 2 but k = 12 is distinct from k = 7 [7 % 5 = 2 while 12 % 5 = 2].

Step 1: Reverse the entire array. This brings the elements that after a rotation are required at the front to the back end of the array, but in reverse.

Step 2: Reverse the first k elements (from index 0 to k-1) in the array. 
This will place these elements in the right order they should appear in the final rotated array of R.

Step 3: Reverse the subsequence of list elements starting from kth position till the last position n – 1.
This is will align the rest of the elements appropriately to effect the rotation process and achieve the right output.

Complexity:
Time complexity:
O(n)

Space complexity:
O(1)*/

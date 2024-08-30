class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
            int c=0;
            int mc=0;
            for(int j=0;j<n;j++)
            {
                if(nums[j]==1)
                c++;
                else
                c=0;
                mc=Math.max(mc,c);
                
            }
            return mc;
        }
    }

/* In the sume given that to return the maximum no of consequetive ones
for this it takes 
1. Time complexity: O(n) -Liner time
2. Space complexity: O(1)- constant time

firstly initialize consecutive ones count as c and max consecutive count of ones as mc  
I checked the consecutive ones if the side by side index elements arwe 1's i incement the c
Then i compare the mac consecutive with consecutive if the max value is stored in the mc
If the consecutive elementis not 1 i make the c to zero so that 
T can again count the consecuutive ones from zero and check it with the max consecutive ones
After that i returned the mc
*/

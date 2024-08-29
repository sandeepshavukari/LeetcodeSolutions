class Solution {
    public int reverse(int n) {
        int c=0,r=0;
        if(n>0)
        {
          while(n>0)
            {
                r=n%10;
                if(c>Integer.MAX_VALUE/10)
                  return 0;
                c=(c*10)+r;
                n=n/10;
            }
        }
        else if(n<0)
          {
            n=n*(-1);
            while(n>0)
              {
                  r=n%10;
                  if(c>Integer.MAX_VALUE/10)
                    return 0;
                  c=(c*10)+r;
                  n=n/10;
              }
             c=c*(-1);
          }
        return c;
    }
}
/*firtsly check that the number is +ve or negetive 
if the num is positive as we know the logic similar to the palindrome 
place that logic here then we can afford the reverse of the num 
in the similar way if the number is -ve multiply it with -1 
and do the same process again then we can get the reverse of the number
Whereas if it is maxvalu of the integer type then we have to make it zero
so every time when we check for the reminder of the number we have to check c
is reched the max limit of integer or not 
as we are chnaging the sign we have to consider only the max value only*/

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

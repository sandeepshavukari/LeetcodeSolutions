public class RomanToInteger {
    static int ans(char c)
    {
        if(c=='I')
        return 1;
        if(c=='V')
        return 5;
        if(c=='X')
        return 10;
        if(c=='L')
        return 50;
        if(c=='C')
        return 100;
        if(c=='D')
        return 500;
        if(c=='M')
        return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        char ar[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();)
        {
            int s1=ans(ar[i]);
             int s2=0;
            if(i+1<s.length())
            s2=ans(ar[i+1]);
            if(s1>=s2)
            {
                sum+=s1;
                i++;
            }
            else
            {
                sum+=s2-s1;
                i+=2;
            }  
        }
        return sum;
    }
}

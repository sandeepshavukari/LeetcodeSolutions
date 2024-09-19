class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int n=x;
        int c=0,r=0;
        while(n>0)
        {
            r=n%10;
            c=c*10+r;
            n=n/10;
        }
        if(c==x)
        return true;
        else
        return false;
    }
}

/* We know palindrome is the number that looks same from both tle leftand right to achieve it we have to check that by the following approach
the approach is to store the given number in some variable and reverse the number by performing
modulus and division operations recursivly until the num is grater than 0
if we do modulo operation with 10 we get the last digit of the number
then by adding the resultant integer to that last digit by multiplying the resultant digit by 10 
and adding then divide that number with 10 if the lop condition fails at last 
if the resultant numer is equal to the given number we can state it as the palindrome 
*/

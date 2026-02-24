class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int sum=0;
        int rev=0;
        int temp=n;
        while(temp>0)
        {
            int  r= temp%2;
            temp /=2;
            sum *=10 +r;
        }
        while(n>0)
        {
            int r = n%10;
            n /=10;
            rev *=10 +r;
        }
        return sum != rev;
    }
}
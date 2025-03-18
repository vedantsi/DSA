class Solution {
    public boolean isPalindrome(int x) {
        int value=0;
        int num=x;
        if(x<0)
        {
            return false;
        }
        while(x>0)
        {
            int d=x%10;
            value=value*10+d;
            x=x/10;

        }
        if(value== num)
        {
            return true;
        }
        return false;
    }
}
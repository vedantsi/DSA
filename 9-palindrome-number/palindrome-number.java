class Solution {
    public boolean isPalindrome(int x) {
        /*
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

        



        //Two pointer approach



        int value=0;
        if(x<0)
        {
            return false;
        }
        String str=String.valueOf(x);
        int n=str.length();
        int left=0; 
        int right=n-1;
        while(left <right)
        {
            if(str.charAt(left)!= str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;


        1  3   3   1 

        0   1   2
        1   2   1

        */
        if(x<0)
        {
            return false;
        }
        String s=String.valueOf(x);
        int n=s.length();
        int left=0; 
        int right= n-1;
        boolean result=isCheck(s, left, right);
        return result;
    }

    public static boolean isCheck(String s, int left, int right)
    {
        if(left> right)
        {
            return true;
        }
        if(s.charAt(left)!=s.charAt(right))
        {
            return false;
        }
        return isCheck(s, left+1, right-1);

    }

}
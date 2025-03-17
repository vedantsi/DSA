class Solution {
    public int reverse(int x) {
        /*
        int sign=(x>0)?1:-1;
        long num=0;
        int result=0;
        x=Math.abs(x);
        while(x>0)
        {
            int d=x%10;
            num=num*10+d;
            x=x/10;
        }
        if(num<=Integer.MAX_VALUE)
        {
            result=(int)num*sign;
        } 
        else
        {
            return 0;
        }    
        return result;
        */







        int sign= (x>0)? 1: -1;
        x=Math.abs(x);
        long value=0;
        while(x>0)
        {
            int d=x%10;
            value=value*10+d;
            x=x/10;
        }
        if(value <=Integer.MAX_VALUE )
        {
            return (int)value *sign;
        }
        else
        {
            return 0;
        }
    }
}
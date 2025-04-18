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
        -------------------------------------------------------------------------------------------







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











        int sign=(x>0)? 1: -1;
        int value=0;
        x=Math.abs(x);
        while(x>0)
        {
            int lastDigit=x%10;
            if(value > Integer.MAX_VALUE/10 || (value==Integer.MAX_VALUE/10 && lastDigit>7 ))
            {
                return 0;
            }
            else if(value < Integer.MIN_VALUE/10 || (value==Integer.MIN_VALUE/10 && lastDigit<-8 ))
            {
                return 0;
            }
            value=value*10 +lastDigit;
            x=x/10;


        }
        return (sign ==1)? value : sign* value;





















        */





        int sign=(x<0)? -1: 1;
        x=Math.abs(x);
        long reverse=0;
        while(x>0)
        {
            int digit=x%10;
            reverse=reverse*10+digit;
            x=x/10;
        }
        if(reverse <Integer.MAX_VALUE)
        {
            return sign*(int)reverse;
        }
        return 0;
    }
}
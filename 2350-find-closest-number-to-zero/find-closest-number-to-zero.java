class Solution {
    public int findClosestNumber(int[] nums) {


        /*
        int result=Integer.MAX_VALUE;
        for(int i: nums)
        {
            if(Math.abs(i)<Math.abs(result))
            {
                result=i;
            }
            else if(Math.abs(i)==Math.abs(result))
            {
                result=Math.max(result, i);
            }
        }
        return result;



        */
        int result=Integer.MAX_VALUE;
        for(int i: nums)
        {
            if(Math.abs(i)<Math.abs(result))
            {
                result=i;
            }
        }
        if(result<0)
        {
            for(int i: nums)
            {
                if(Math.abs(result)==i)
                {
                    result=i;
                }
            }
        }
        return result;
        
    }

}
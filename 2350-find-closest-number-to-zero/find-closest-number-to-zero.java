class Solution {
    public int findClosestNumber(int[] nums) {
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
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedsum=0;
        int calculatedSum=0;
        for(int i=1; i<=n; i++)
        {
            expectedsum=expectedsum+i;
        }
        for(int i=0; i<nums.length; i++)
        {
            calculatedSum=calculatedSum+nums[i];
        }
        return expectedsum-calculatedSum;
    }
}
class Solution {
    private boolean checkDistinct(int nums[], int i)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int j=i; j<nums.length; j++)
        {
            if(set.contains(nums[j]))
            {
                return false;
            }
            set.add(nums[j]);
        }
        return true;
    }
    public int minimumOperations(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i+=3)
        {
            if(checkDistinct(nums, i))
            {
                return result;
            }
            result++;
        }
        return result;
    }
} 
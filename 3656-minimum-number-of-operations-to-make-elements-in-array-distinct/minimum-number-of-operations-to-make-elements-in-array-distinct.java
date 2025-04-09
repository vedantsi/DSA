class Solution {
    /*
    private boolean checkDistinct(int nums[], int i)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int j=i; j<nums.length; j++)//O(N)
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
        for(int i=0; i<nums.length; i+=3)//O(N/3)
        {
            if(checkDistinct(nums, i))
            {
                return result;
            }
            result++;
        }
        return result;
    }
    */
    public int minimumOperations(int[] nums) {
        int result=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=nums.length-1; i>=0; i--)//O(N)
        {
            if(set.contains(nums[i]))
            {
                return (int)Math.ceil((i+1)/3.0);
            }
            set.add(nums[i]);
        }
        return result;
    }
} 
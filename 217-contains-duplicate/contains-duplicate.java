class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;

    }//Time complexity: O(N log N)+ O(N)
    */
        HashSet<Integer> checkDuplicate=new HashSet<Integer>();
        for(int n:nums)
        {
            if(checkDuplicate.contains(n))
            {
                return true;
            }
            checkDuplicate.add(n);
        }
        return false;
    }

}
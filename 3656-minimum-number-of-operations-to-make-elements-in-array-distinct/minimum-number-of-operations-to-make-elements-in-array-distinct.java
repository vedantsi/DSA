class Solution {
    public int minimumOperations(int[] nums) {
        int result=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int val: nums)
        {
            list.add(val);
        }
        while(true)
        {
            HashSet<Integer> set=new HashSet<>();
            boolean hasDuplicate=false;
            for (int val : list) {
                if (set.contains(val)) {
                    hasDuplicate = true;
                    break;
                }
                set.add(val);
            }

            if (!hasDuplicate) {
                break;
            }
            int toRemove = Math.min(3, list.size());
            for (int i = 0; i < toRemove; i++) {
                list.remove(0);
            }
            result++;
        }

        return result;
    }
} 
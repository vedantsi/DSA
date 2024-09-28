class Solution {
    public long maximumTotalSum(int[] maximumHeight) {

        /*
        Arrays.sort(maximumHeight);
        long result = 0;
        int n = maximumHeight.length;
        int currentMax = maximumHeight[n - 1]; 
        
        result += currentMax;
        for (int i = n - 2; i >= 0; i--) {
            if (maximumHeight[i] == currentMax) {
                currentMax--; 
            } else {
                currentMax = maximumHeight[i];  
            }
            if (currentMax <= 0) {
                return -1;
            }
            result += currentMax;
        }
        
        return result;


        
        Arrays.sort(maximumHeight);
        long result=0;
        ArrayList<Integer> list=new ArrayList<>();
        int n=maximumHeight.length;
        list.add(maximumHeight[n-1]);
        for(int i=n-2; i>=0; i--)
        {
            int value=maximumHeight[i];
            while(list.contains(value))//--->contains() in list takes O(n) time, think of
                                        //Hashet
            {
                value=value-1;
            }
            if(value<=0)
            {
                return -1;
            }
            list.add(value);
        }
        for(int i=0; i<list.size(); i++)
        {
            result=result+list.get(i);
        }
        return result;

        


        long result=0; 
        HashSet<Integer> set =new HashSet<>();
        int n=maximumHeight.length;
        set.add(maximumHeight[n-1]);
        for(int i=n-2; i>=0; i--)
        {
            int value=maximumHeight[i];
            while(set.contains(value))
            {
                value=value-1;
            }
            if(value<=0)
            {
                return -1;
            }
            set.add(value);
        }
        for(int val: set)
        {
            result=result+val;
        }
        return result;



        */
        Arrays.sort(maximumHeight);
        long result=0;
        int n=maximumHeight.length;
        int currentmax=maximumHeight[n-1];
        result=result+currentmax;
        for(int i=n-2; i>=0; i--)
        {
            if(maximumHeight[i]>=currentmax)
            {
                currentmax--;
            }
            else
            {
                currentmax=maximumHeight[i];
            }
            if(currentmax<=0)
            {
                return -1;
            }
            result=result+currentmax;
        }
        return result;
    }
}
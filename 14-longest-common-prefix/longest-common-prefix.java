class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*
        String result="";
        int minLength=Integer.MAX_VALUE;
        for(String s: strs)
        {
            minLength=Math.min(minLength, s.length());
        }
        for(int i=0; i<minLength; i++)
        {
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length; j++)
            {
                if(c!=strs[j].charAt(i))
                {
                    return result;
                }
            }

            result=result+c;
        }
        return result;


        */
        int minLength=Integer.MAX_VALUE;
        for(String s: strs)
        {
            minLength=Math.min(minLength, s.length());
        }
        int left=0;
        int right=minLength;
        while(left<=right)
        {
            int mid=(right+left)/2;
            if(checkPrefix(strs, mid))
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        int maxLength=(left+right)/2;
        return strs[0].substring(0, maxLength);

    }
    private boolean checkPrefix(String strs[], int length)
    {
        String s=strs[0].substring(0, length);
        for(int i=1; i<strs.length; i++)
        {
            if(!strs[i].startsWith(s))
            {
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
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
    }
}
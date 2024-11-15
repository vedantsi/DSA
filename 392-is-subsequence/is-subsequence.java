class Solution {
    public boolean isSubsequence(String s, String t) {


        /*

        int i=0; int j=0;
        int n1=s.length();
        int n2=t.length();
        while(i<n1 && j<n2)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        boolean result=false;
        if(i==n1)
        {
            result=true;
        }
        return result;


        */
        int n1=s.length();
        int n2=t.length();
        return helper(s, t, n1, n2);
        
    }
    private boolean helper(String s, String t, int n1, int n2)
    {
        if(n1==0)
        {
            return true;
        }
        if(n2==0)
        {
            return false;
        }
        if(s.charAt(n1-1)==t.charAt(n2-1))
        {
            return helper(s, t, n1-1, n2-1);

        }
        else
        {
            return helper(s, t, n1, n2-1);
        }

    }
}
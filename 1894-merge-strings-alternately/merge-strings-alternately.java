class Solution {
    public String mergeAlternately(String word1, String word2) {

        int n1=word1.length();
        int n2=word2.length();
        /*
        String result="";
        while(i<n1 || j<n2)
        {
            if(i<n1)
            {
                result=result+word1.charAt(i);
                i++;
            }
            if( j<n2)
            {
                result=result+word2.charAt(j);
                j++;
            }
        }
        return result;


        
        String result="";
        while(i<n1 && j<n2)
        {
            result=result+word1.charAt(i);
            i++;
            result=result+word2.charAt(j);
            j++;
        }
        while(i<n1)
        {
            result=result+word1.charAt(i);
            i++;
        }
        while(j<n2)
        {
            result=result+word2.charAt(j);
            j++;
        }
        return result;




        */
        StringBuilder result=new StringBuilder();
        int val=Math.max(n1, n2);
        for(int i=0; i<val; i++)
        {
            if(i<n1)
            {
                result.append(word1.charAt(i));
            }
            if(i <n2)
            {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}
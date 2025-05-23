class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        if(s.length() !=t.length() )
        {
            return false;
        }
        HashMap<Character, Integer> countofS=new HashMap<>();
        HashMap<Character, Integer> countofT=new HashMap<>();
        for(char c:s.toCharArray())
        {
            countofS.put(c, countofS.getOrDefault(c, 0)+1);
        }
        for(char ct: t.toCharArray())
        {
            countofT.put(ct, countofT.getOrDefault(ct, 0)+1);
        }
        for(char ch:countofS.keySet())
        {
            if(!countofT.containsKey(ch) || !countofT.get(ch).equals(countofS.get(ch)))
            {
                return false;
            }
        }
        return true;
        Time Complexity: O(N)+O(N)+O(1)---0(26)
        Space Complexity: O(N)+O(N)---->since we know there are 26 unique chracters
        O(26)--->O(1)
        */





        //--------------------------------------------------------------------------------
        /*
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character, Integer> CountFreq=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            CountFreq.put(ch, CountFreq.getOrDefault(ch, 0)+1);
        }
        for(char c:t.toCharArray())
        {
            if(CountFreq.containsKey(c))
            {
                int value=CountFreq.get(c)-1;
                if(value<0)
                {
                    return false;
                }
                CountFreq.put(c, value);
            }
            else
            {
                return false;
            }

        }
        return true;

        //Time Complexity: O(N)+O(N)--->O(N)
        //Space Complexity: O(K), where K is unqiue element in string S




        */





        //------------------------------------------------------------------------------------------------------------
        /*
        if(s.length()!=t.length())
        {
            return false;
        }
        int charFreq[]=new int[26];
        for(char ch:s.toCharArray())
        {
            charFreq[ch-'a']++;
        }
        for(char c:t.toCharArray())
        {
            charFreq[c-'a']--;
            if(charFreq[c-'a']<0)
            {
                return false;
            }
        }
        return true;

        //Time Complexity: O(N)
        //Space Complexity: O(26)----.O(1)
        */





        //----------------------------------------------------------------------------------------------------------




        //FOR UNICODE:
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Integer, Integer> countFreq=new HashMap<>();
        for(int i=0; i<s.length();)
        {
            int codePoint =s.codePointAt(i);
            countFreq.put(codePoint, countFreq.getOrDefault(codePoint, 0)+1);
            i+=Character.charCount(codePoint);///Skip surrogate pairs

        }

        for(int i=0; i<t.length();)
        {
            int codePoint=t.codePointAt(i);
            if(countFreq.containsKey(codePoint))
            {
                int value=countFreq.get(codePoint)-1;
                if(value <0)
                {
                    return false;
                }
                else
                {
                    countFreq.put(codePoint, value);
                }
            }
            else
            {
                return false;
            }
            i+=Character.charCount(codePoint);
            
        }
        return true;

        //Time complexity: O(N)
        //Space complexity: O(K)

    }
}
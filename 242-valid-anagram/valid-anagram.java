class Solution {
    public boolean isAnagram(String s, String t) {
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
    }
}
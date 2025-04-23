class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        for(int i=1; i<=n;i++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            String s=String.valueOf(i);
            if(s.length()==1)
            {
                list.add(i);
                map.put(i, list);
            }
            else
            {
                int sum=0;
                for(char ch:s.toCharArray())
                {
                    sum=sum+(ch -'0');
                }
                if(map.containsKey(sum))
                {
                    ArrayList<Integer> update=new ArrayList<>();
                    update.addAll(map.get(sum));
                    update.add(i);
                    map.put(sum, update);
                }
                else
                {
                    ArrayList<Integer> ins=new ArrayList<>();
                    ins.add(i);
                    map.put(sum, ins);
                }


            }
        }
        int result=0;
        for(int value:map.keySet())
        {
            result=Math.max(result, map.get(value).size());
        }
        int answer=0;
        for(int v:map.keySet())
        {
            if(map.get(v).size()==result)
            {
                answer ++; 
            }
        }
        return answer;
        
    }
}
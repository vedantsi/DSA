class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        for(int i=1; i<=n;i++)
        {
            int num=i;
            int sum=0;
            while(num >0)
            {
                int digit=num%10;
                sum=sum+digit;
                num=num/10;
            }
            if(!map.containsKey(sum))
            {
                 map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);
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
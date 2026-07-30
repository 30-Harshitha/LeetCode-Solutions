class Solution {
    public int minimumPushes(String word) {
        int ans=0;
        HashMap<Character,Integer> m=new HashMap<>();
        for(char c: word.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        List<Integer> freq = new ArrayList<>(m.values());
        Collections.sort(freq, Collections.reverseOrder());
        for(int i=0;i<freq.size();i++)
        {
            if(i<8)
            ans+=1*freq.get(i);
            else if(i<16)
            ans+=2*freq.get(i);
            else if(i<24)
            ans+=3*freq.get(i);
            else
            ans+=4*freq.get(i);
        }
        return ans;
    }
}
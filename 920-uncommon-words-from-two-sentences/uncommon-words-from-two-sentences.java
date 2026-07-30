class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> m=new HashMap<>();
        for(String word:s1.split(" "))
        m.put(word,m.getOrDefault(word,0)+1);
        for(String word:s2.split(" "))
        m.put(word,m.getOrDefault(word,0)+1);
        ArrayList<String> j= new ArrayList<>();
        for(String c: m.keySet())
        { 
            if(m.get(c)==1)
            j.add(c);

        }
        return j.toArray(new String[0]);
    }
}
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {   StringBuilder s=new StringBuilder();
        s.append(words[i]);
            if(s.toString().contains(String.valueOf(x)))
            {
                a.add(i);
            }
        }
        return a;
    }
}
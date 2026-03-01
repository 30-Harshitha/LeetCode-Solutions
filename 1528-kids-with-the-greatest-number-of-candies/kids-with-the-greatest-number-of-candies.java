
        class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE,i;
        ArrayList<Boolean> a=new ArrayList<>();
        for(i=0;i<candies.length;i++)
        {
            max=Math.max(candies[i],max);
        }
        for(i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                a.add(true);
            }
            else
            {
                a.add(false);
            }

        }
        return a;

    }
}
    
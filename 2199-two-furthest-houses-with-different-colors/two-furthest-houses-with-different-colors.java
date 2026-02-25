class Solution {
    public int maxDistance(int[] colors) {
        ArrayList<Integer> m=new ArrayList<>();
        int max=Integer.MIN_VALUE,diff=0;
        for(int i=0;i<=colors.length-2;i++)
        {for(int j=i+1;j<=colors.length-1;j++)
           {if(colors[i]!=colors[j])
           {
            diff=Math.abs(i-j);
            if(max<diff)
            {
                max=diff;
            }
           
            }
           }
             
         
}
return max;
    }
}
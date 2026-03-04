class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,sum=0;
        for(int i=0;i<salary.length;i++)
        {
           max=Math.max(max,salary[i]);
           min=Math.min(min,salary[i]);
           sum+=salary[i];
        }
        sum-=max;
        
        return (double)(sum-min)/(salary.length-2);
    }
}
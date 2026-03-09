class Solution {
    public int maxArea(int[] height) {
        int i=0,a=0,m=0;
        int j=height.length-1;
     while(i<j)
     {
        if(height[i]<height[j])
        {
            m=height[i]*(j-i);
        i++;
        
        }
        else if(height[i]>=height[j])
        {m=height[j]*(j-i);
        j--;
        
        }
        a=Math.max(m,a);
    }
    return a;
    }
}
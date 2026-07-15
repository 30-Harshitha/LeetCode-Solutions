class Solution {
    public void moveZeroes(int[] a) {
        int temp=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            { 
                if(a[i]==0)
                {
                    if(a[j]!=0)
                    {
                        temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;
                    }
                }

            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}
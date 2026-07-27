class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
             ArrayList<Integer> temp=new ArrayList<Integer>();
            int n=nums[i];
             while (n != 0) {
                temp.add(n % 10);
                n /= 10;
            }

            Collections.reverse(temp);
            a.addAll(temp);
        }

            
        
        int[] r=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            r[i]=a.get(i);
        }
        return r;
    }
}
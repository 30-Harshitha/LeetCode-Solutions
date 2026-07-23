class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int d=0,sum=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++)
        {
            d=Math.abs(seats[i]-students[i]);
            sum+=d;
        }
        return sum;
    
    }
}
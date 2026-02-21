class Solution {
    public int findNumbers(int[] nums) {
        int l= nums.length;
        int c=0;
        int count=0;
        for(int i =0;i<l;i++)
        {
            
            int temp = nums[i];
            while(temp>0)
            {
                temp /= 10;
                c++;
            }if(c%2==0)
            {
                count++;
                c=0;
            }
            else{
                c=0;
            }
        }return count;
        
    }
}
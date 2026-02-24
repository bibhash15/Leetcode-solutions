class Solution {
    public int searchInsert(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else if ( nums[i]>target)
            {
             c= i;
             break;
            }
            else if(i==nums.length-1 && nums[nums.length-1]<target)
            {
                c=i+1;
            }
        }
        return c;
        
    }
}
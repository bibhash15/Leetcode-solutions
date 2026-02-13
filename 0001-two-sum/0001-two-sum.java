class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        for(int i=0;i<nums.length-1;i++)
        {
             for(int j=i;j<nums.length-1;j++)
        {
            if(nums[i]+nums[j+1]==target)
            {
                a[0]=i;
                a[1]=j+1;
                break;
            }

        }
        }
        return a;
        
    }
}
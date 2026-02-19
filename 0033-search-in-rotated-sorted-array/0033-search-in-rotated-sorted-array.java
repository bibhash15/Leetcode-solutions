class Solution {
    public int search(int[] nums, int target) {
        int i;
        for( i =0;i<nums.length;i++)
        {
            if(target == nums[i])
            {
                break;
            }
        }
        if(i==nums.length)
        {
            return -1;
        }
        return i;
    }
}
class Solution {
    public int differenceOfSum(int[] nums) {
        int l = nums.length;
         int s1=0;
         int s2=0;
         for(int i =0;i<l;i++){
             s1 += nums[i];
             while(nums[i]>0){
                 int r= nums[i]%10;
                 nums[i] /=10;
                 s2 += r;
             }
         }
        return s1-s2;
    }
}
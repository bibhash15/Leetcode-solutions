class Solution {
    public int singleNumber(int[] nums) {
        int l = nums.length;
         if(l==1){
             return nums[0];
         } int c=0;
        for(int i=0 ; i<l;i++){
              for(int j=0 ; j<l;j++){
                  if(nums[i]==nums[j]){
                      c++;
                  }
              } if (c==1){
                  return nums[i];
              }
            else{
                c=0;
            }
        } return -1; 
    }
}
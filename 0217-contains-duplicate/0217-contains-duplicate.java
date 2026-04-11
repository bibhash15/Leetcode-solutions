class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        if(l == 1)
            return false;
        
         for(int i =0 ; i<l ;i++) {
             if(i==l-1)
                 break; 
             if(nums[i]==nums[i+1])
        {
            return true;
        }
         
              
    }return false;  
            
}}
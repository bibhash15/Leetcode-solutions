class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l =nums.length;
        int arr[] = new int[l];
        int pro =1;
         arr[0] =1;
for(int i =1 ; i<l ; i++){
    arr[i] = arr[i-1] * nums[i-1];
}

for(int j = l-1 ;j >=0 ; j--)
{
    arr[j] = arr[j] * pro ;
    pro = pro * nums[j];
}
return arr;
    }}
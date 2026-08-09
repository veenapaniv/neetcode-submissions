class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] prefx = new int[n];
        int[] sufx = new int[n];

        prefx[0] = 1;
        sufx[n-1] =1;

        for (int i =1; i<n; i++){
            prefx[i] = nums[i-1]*prefx[i-1];
        } 

        for(int i = n-2; i>=0; i--){
            sufx[i] = sufx[i+1]*nums[i+1];
        }
        for(int i = 0; i < n; i++){
            res[i] = prefx[i]*sufx[i];
        }
        return res;
    }
}  

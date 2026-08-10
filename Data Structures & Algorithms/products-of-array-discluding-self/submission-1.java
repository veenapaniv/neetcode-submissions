class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] prefx = new int[n];
        int[] sufx = new int[n];

        prefx[0] = sufx[n-1] = 1;

        // calculate the product of all the numbers preceeding i
        for(int i=1; i< n; i++){
            prefx[i] = nums[i-1] * prefx[i-1];
        }

        //calculate the product of all the numbers
        // after i to get the suffix
        for(int i = n-2; i>=0; i--){
            sufx[i] = nums[i+1] * sufx[i+1];
        }

        // calculate the result which is the
        // product of prefix and sufix
        for(int i=0;i<n; i++){
            res[i] = prefx[i] * sufx[i];
        }
        
        // finally return the res array
        return res;

    }
}  

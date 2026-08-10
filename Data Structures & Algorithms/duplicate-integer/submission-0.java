class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set seen = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            // find if the number exists in the set
            if(seen.contains(nums[i])){
                return true;
            }
            // else add the number to the set
            seen.add(nums[i]);
        }
        // set does not contain duplicate
        return false;
        
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();

        for(int i =0; i< nums.length; i++){
            // find the difference of target and the i'th number
            int diff = target - nums[i];

            // check if the diff exists in the map
            if(sum.containsKey(diff)){
                return new int[] {sum.get(diff), i};
            }

            // else add the original number from the array
            // into the map along with it's position.
            sum.put(nums[i],i);
        }

        return new int[] {};
        
    }
}

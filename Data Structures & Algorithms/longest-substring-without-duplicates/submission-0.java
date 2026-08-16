class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Initialize a HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, res = 0;

        for(int r=0; r < s.length(); r++){
            // if the map contains the right character
            if(map.containsKey(s.charAt(r))){
                // adjust the window size, move r one
                // step after but never backwards
                l = Math.max(map.get(s.charAt(r))+1, l);
            }

            // else, put the character in to map 
            // and calculate max size and store in res
            map.put(s.charAt(r), r);
            res = Math.max(res, r - l+1);
        }
        return res;
    }
}

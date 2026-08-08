class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();

        for(String os : strs){
            int[] count = new int[26];
            for(char c : os.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(os);
            
        }

       return new ArrayList<>(res.values());
    }
}

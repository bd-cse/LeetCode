class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sortedWord = new String(charArr);

            if (map.containsKey(sortedWord)) {
                map.get(sortedWord).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedWord, list);
            }
        }        
        return new ArrayList<>(map.values());
    }
}
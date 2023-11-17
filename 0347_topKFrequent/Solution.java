class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        List[] vals = new ArrayList[nums.length + 1];
        List<Integer> res = new ArrayList<>();
        int[] resArr = new int[k];

        for (int i = 0; i < nums.length; i++) {
            if (counts.containsKey(nums[i])) {
                counts.replace(nums[i], counts.get(nums[i]) + 1);
            } else {
                counts.put(nums[i], 1);
            }
        }

        List<Integer> keys = new ArrayList<>(counts.keySet());
        for (int i = 0; i < keys.size(); i++) {
            if (vals[counts.get(keys.get(i))] == null) {
                vals[counts.get(keys.get(i))] = new ArrayList<Integer>();
            }
            vals[counts.get(keys.get(i))].add(keys.get(i));
        }

        for (int i = vals.length - 1; i > 0; i--) {
            if (vals[i] != null) {
                for (int j = 0; j < vals[i].size(); j++) {
                    Integer I = (Integer) vals[i].get(j);
                    res.add(I);
                    if (res.size() == k) {
                        break;
                    }
                }
            }
            if (res.size() == k) {
                break;
            }
        }
        
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }
}
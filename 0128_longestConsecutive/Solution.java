class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longestSeq   = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int i = 0;
                int seq = 0;
                while (set.contains(num + i)) {
                    seq++;
                    i++;
                }

                if (seq > longestSeq) {
                    longestSeq = seq;
                }
            }

            // This is only here for efficiency, if we know longestSeq
            // is over half the size of the array then that's it.
            if (longestSeq > nums.length / 2) {
                break;
            }
        }

        return longestSeq;
    }
}
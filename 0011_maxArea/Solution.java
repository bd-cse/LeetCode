class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;

        int left = height[i];
        int right = height[j];

        while (i != j) {
            max = Math.max(max, Math.min(left, right) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            left = height[i];
            right = height[j];
        }
        return max;
    }
}
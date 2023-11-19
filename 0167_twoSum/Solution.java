class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPtr  = numbers[0];
        int rightPtr = numbers[numbers.length-1];
        int sum      = leftPtr + rightPtr;

        int i = 0;
        int j = numbers.length - 1;
        while (sum != target) {
            if (sum < target) {
                i++;
                leftPtr = numbers[i];
            } else {
                j--;
                rightPtr = numbers[j];
            }
            sum = leftPtr + rightPtr;
        }
        return new int[] {i + 1, j + 1};
    }
}
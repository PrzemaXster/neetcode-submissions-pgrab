class Solution {
    // return indices  of [index1, index2]
    // indexes must add up to target
    // index1 < index2
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            numToIndexMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numToIndexMap.containsKey(target - numbers[i])) {
                if (target - numbers[i] > numbers[i]) {
                    return new int[]{i + 1, numToIndexMap.get(target - numbers[i]) + 1};
                } else {
                    return new int[]{numToIndexMap.get(target - numbers[i]) + 1, i + 1};
                }
            }
        }
        return null;
    }
}

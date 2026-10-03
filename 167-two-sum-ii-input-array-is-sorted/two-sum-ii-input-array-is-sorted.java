class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int remaining = target - numbers[i];
            if (map.containsKey(numbers[i])) {
                arr[0] = map.get(numbers[i]) + 1;
                arr[1] = i + 1;
                return arr;
            }
            map.put(remaining, i);
        }
        return arr;
    }
}
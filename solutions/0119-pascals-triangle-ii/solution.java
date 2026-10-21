class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long result = 1;
        for (int i = 0; i <= rowIndex; i++) {
            list.add((int)result);
            result = result * (rowIndex - i) / (i + 1);
        }

        return list;
    }
}

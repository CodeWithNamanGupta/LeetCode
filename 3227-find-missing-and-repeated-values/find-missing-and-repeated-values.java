class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashSet<Integer> set = new HashSet<>();
        int asum = ((n*n)*((n*n)+1))/2;
        int sum = 0;
        int[] arr= new int [2];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (set.contains(grid[i][j])) {
                    arr[0] = grid[i][j];
                }
                else{
                    sum+=grid[i][j];
                    set.add(grid[i][j]);
                }
            }
        }
        arr[1]=Math.abs(asum-sum);
        return arr;
    }
}
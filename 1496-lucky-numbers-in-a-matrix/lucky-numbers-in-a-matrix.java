class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;       // number of rows
        int n = matrix[0].length;    // number of columns
        
        int[] rowMin = new int[m];
        int[] colMax = new int[n];
        
        // Step 1: Find min in each row
        for (int i = 0; i < m; i++) {
            int minVal = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                minVal = Math.min(minVal, matrix[i][j]);
            }
            rowMin[i] = minVal;
        }
        
        // Step 2: Find max in each column
        for (int j = 0; j < n; j++) {
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
            colMax[j] = maxVal;
        }
        
        // Step 3: Find common elements (rowMin == colMax)
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        
        return result;
    }
}

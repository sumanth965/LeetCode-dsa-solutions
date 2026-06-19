class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            boolean[] rowSeen = new boolean[n + 1];
            boolean[] colSeen = new boolean[n + 1];
            for (int j = 0; j < n; j++) {
                int r = matrix[i][j];
                int c = matrix[j][i];
                if (rowSeen[r] || colSeen[c]) return false;
                rowSeen[r] = true;
                colSeen[c] = true;
            }
        }
        return true;
    }
}
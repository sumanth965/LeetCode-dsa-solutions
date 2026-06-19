class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int answer[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            int max = 0;

            for (int j = 0; j < row; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }

            for (int j = 0; j < row; j++) {
                if (answer[j][i] == -1) {
                    answer[j][i] = max;
                }
            }
        }

        return answer;
    }
}
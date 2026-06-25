class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int[] soldierCount = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            soldierCount[i] = count;
        }

        boolean[] visited = new boolean[mat.length];
        for (int i = 0; i < k; i++) {
            int minIndex = -1;
            for (int j = 0; j < mat.length; j++) {
                if (!visited[j]) {
                    if (minIndex == -1 || soldierCount[j] < soldierCount[minIndex]) {
                        minIndex = j;
                    }
                }
            }
            result[i] = minIndex;
            visited[minIndex] = true;
        }

        return result;
    }
}
class CellswithOddValuesinaMatrix{
    public int oddCells(int m, int n, int[][] a) {
     int[][] b = new int[m][n];

        for (int i = 0; i < a.length; i++) {
            int row = a[i][0];
            int col = a[i][1];

            for (int y = 0; y < n; y++) {
                b[row][y]++;
            }
            
            for (int x = 0; x < m; x++) {
                b[x][col]++;
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
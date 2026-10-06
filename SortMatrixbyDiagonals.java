class SortMatrixbyDiagonals{
    public int[][] sortMatrix(int[][] a) {
         int n = a.length;

        
        for (int startRow = 0; startRow < n; startRow++) {
            int len = n - startRow;
            int[] temp = new int[len];
            
            for (int k = 0; k < len; k++) {
                temp[k] = a[startRow + k][0 + k];
            }
            
            Arrays.sort(temp);
            
            for (int k = 0; k < len; k++) {
                a[startRow + k][0 + k] = temp[len - 1 - k];
            }
        }

       
        for (int startCol = 1; startCol < n; startCol++) {
            int len = n - startCol;
            int[] temp = new int[len];
            
            for (int k = 0; k < len; k++) {
                temp[k] = a[0 + k][startCol + k];
            }
            
            Arrays.sort(temp);
            
            for (int k = 0; k < len; k++) {
                a[0 + k][startCol + k] = temp[k];
            }
        }

        return a;
    }
}
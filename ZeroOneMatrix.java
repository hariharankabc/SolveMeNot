class ZeroOneMatrix {
// 542.problems/01-matrix/
    public int[][] updateMatrix(int[][] mat) {
        int rowLast = mat.length - 1;
        int colLast = mat[0].length - 1;
        int[] row = mat[0];
        int[] prevRow;
        if (row[0] == 1)                        
            row[0] = rowLast + colLast + 2;
        for (int c = 1; c <= colLast; c++)
            if (row[c] == 1)  
                row[c] = row[c - 1] + 1;
        for (int r = 1; r <= rowLast; r++) {
            prevRow = row;
            row = mat[r];
            if (row[0] == 1)
                row[0] = prevRow[0] + 1;
            for (int c = 1; c <= colLast; c++)
                if (row[c] == 1)
                    row[c] = Math.min(row[c - 1], prevRow[c]) + 1;
        }
        row = mat[rowLast];
        for (int c = colLast - 1; c >= 0; c--)
            if (row[c] > 1)
                row[c] = Math.min(row[c], row[c + 1] + 1);
        for (int r = rowLast - 1; r >= 0; r--) {
            prevRow = row;
            row = mat[r];
            if (row[colLast] > 1)                  
                row[colLast] = Math.min(row[colLast], prevRow[colLast] + 1);
            for (int c = colLast - 1; c >= 0; c--)
                if (row[c] > 1)
                    row[c] = Math.min(row[c], Math.min(row[c + 1], prevRow[c]) + 1);
        }
        
        return mat;
    }
}

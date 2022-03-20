class ReshapeTheMatrix {
  // problems/reshape-the-matrix (NB)
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r*c == mat.length*mat[0].length)||(r == mat.length && c == mat[0].length)){
            int[][] requiredMatrix = new int[r][c];
            int xIndex = 0;
            int yIndex = 0;
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[0].length; j++){
                    requiredMatrix[xIndex][yIndex] = mat[i][j];
                    yIndex = yIndex + 1;
                    if(yIndex == c){
                        xIndex = xIndex + 1;
                        yIndex = 0;
                    }
                }
            }
            return requiredMatrix;
        }
        return mat;
    }
}

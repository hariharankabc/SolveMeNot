class PascalsTriangle {
  // problems/pascals-triangle/
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrixList = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j=0; j<i+1;j++){
                if(j==0 || j == i){
                  list.add(1);  
                }else{
                    list.add(matrixList.get(i-1).get(j-1) + matrixList.get(i-1).get(j));
                }
            }
            matrixList.add(list);
        }
        return matrixList;
    }
}

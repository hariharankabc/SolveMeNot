class ValidSudoku {
  // 36-problems/valid-sudoku/
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++){
            Set<Character> h = new HashSet<Character>();
            for(int j = 0; j< 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(!h.add(board[i][j])){
                    return false;
                }
            }
        }
        for (int i = 0; i < 9; i++){
            Set<Character> h = new HashSet<Character>();
            for(int j = 0; j< 9; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(!h.add(board[j][i])){
                    return false;
                }
            }
        }
        int counter = 0;
        int counterTwo = 0;
        for(int i=0; i<9; i++){
            counter = i%3;
            if(i%3 == 0 && i !=0){
               counterTwo = counterTwo+1; 
            }
            Set<Character> h = new HashSet<Character>();
            for(int j=3*counterTwo; j<(counterTwo+1)*3; j++){
                for(int k=counter*3; k<(counter+1)*3; k++){
                    if(board[j][k] == '.'){
                    continue;
                    }
                    if(!h.add(board[j][k])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

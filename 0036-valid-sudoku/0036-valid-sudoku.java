class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int row=0; row<9; row++){
            for(int col=0; col<9; col++){
                char num = board[row][col];
                if(num == '.'){
                    continue;
                }
                if(!set.add(num + " in row " + row) ||
                   !set.add(num + " in col " + col) || 
                   !set.add(num + " in box " + (row/3) + "-" + (col/3)) ){
                    return false;
                   }
            }
        }
        return true;
    }
}
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(i,j,board,c)){
                            board[i][j]=c;
                           if(solve(board)==true){
                              return true;
                            }else{
                               board[i][j]='.';
                            }
                        }
                        
                    }
                    return false;
                    
                }
                
            }
        }
        return true;
    }
    public boolean isValid(int row,int col,char[][] board,char c){
        for(int i=0;i<9;i++){
            if(board[i][col]==c)return false;
            if(board[row][i]==c)return false;
            int newRow=3*(row/3);
            int newCol=3*(col/3);
            for(int j=newRow;j<newRow+3;j++){
                for(int k=newCol;k<newCol+3;k++){
                    if(board[j][k]==c)return false;
                }
            }
            
        }
        return true;
    }
}
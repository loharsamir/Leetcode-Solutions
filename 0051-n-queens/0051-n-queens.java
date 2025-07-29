class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        dfs(0,board,ans);
        return ans;
    }
    public void dfs(int col,char[][] board,List<List<String>> ans){
        if(col==board.length){
            ans.add(constructer(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(validate(board,row,col)){
                board[row][col]='Q';
                dfs(col+1,board,ans);
                board[row][col]='.';
            }
        }
    }
    public boolean validate(char[][] board,int row,int col){
        int duprow=row;
        int dupcol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q')return false;
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0){
            if(board[row][col]=='Q')return false;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q')return false;
            col--;
            row++;
        }
        return true;
    }
    public List<String> constructer(char[][] board){
        List<String>list=new ArrayList<>();
        for(char[] ch:board){
            list.add(new String(ch));
        }
        return list;
    }
}
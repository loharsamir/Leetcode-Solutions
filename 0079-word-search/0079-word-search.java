class Solution {
    public boolean exist(char[][] board, String word) {
        for(int r=0;r<board.length;r++){
            for(int c=0; c<board[0].length;c++){
                if(dfs(0,r,c,word,board))return true;
            }
        }
        return false;
    }
    public boolean dfs(int i,int r,int c,String word,char[][] board){
        if(i==word.length())return true;
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || word.charAt(i)!=board[r][c])return false;

        char temp=board[r][c];
        board[r][c]='#';

        boolean isValid=dfs(i+1,r+1,c,word,board) ||
                        dfs(i+1,r-1,c,word,board) ||
                        dfs(i+1,r,c+1,word,board) ||
                        dfs(i+1,r,c-1,word,board);  

        board[r][c]=temp;
        return isValid;                  
    }
}
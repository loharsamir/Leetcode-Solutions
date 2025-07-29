class Solution {
    public int[][] generateMatrix(int n) {
        
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int limit=(int)Math.pow(n,2);
        int i=1;
        int[][] ans=new int[n][n];
        while(limit>=i){
            for(int j=left;j<=right;j++){
                ans[top][j]=i;
                i++;
            }
            top++;
            for(int j=top;j<=bottom;j++){
                ans[j][right]=i;
                i++;
            }
            right--;
            for(int j=right;j>=left;j--){
                ans[bottom][j]=i;
                i++;
            }
            bottom--;
            for(int j=bottom;j>=top;j--){
                ans[j][left]=i;
                i++;
            }
            left++;
        }
        return ans;
    }
}
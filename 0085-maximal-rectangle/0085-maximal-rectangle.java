class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] prefixSum=new int[row][col];
        for(int i=0;i<col;i++){
            int sum=0;
            for(int j=0;j<row;j++){
                sum+=matrix[j][i]-'0';
                if(matrix[j][i]=='0')sum=0;
                prefixSum[j][i]=sum;

            }
        }
        int max=0;
        for(int i=0;i<row;i++){
            max=Math.max(max,maxHist(prefixSum[i]));
        }
        return max;
        
    }
    public int maxHist(int[] arr){
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer>st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st.clear();

        for(int i=0;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int area=width * arr[i];
            max=Math.max(max,area);
        }
        return max;
    }
}
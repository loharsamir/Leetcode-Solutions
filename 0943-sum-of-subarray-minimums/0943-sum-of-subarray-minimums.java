class Solution {
    public int sumSubarrayMins(int[] arr) {
        //int MOD = 1_000_000_007;
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     int min=arr[i];
        //     for(int j=i;j<arr.length;j++){
        //         min=Math.min(min,arr[j]);
        //         sum=(sum+min) % MOD;
        //     }
        // }
        // return sum;

        int n=arr.length;
        int MOD=(int)1e9+7;
        int left[]=new int[n];
        int right[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            left[i]=st.size()>0?st.peek():-1;
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>arr[i]){
                st.pop();
            }
            right[i]=st.size()>0?st.peek():n;
            st.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            long leftIdx=i-left[i];
            long rightIdx=right[i]-i;
            sum+=leftIdx * rightIdx * arr[i];
            sum=sum%MOD;
        }
        return (int)sum;
    }
}
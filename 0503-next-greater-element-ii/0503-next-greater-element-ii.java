class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // int n=nums.length;
        // int ans[]=new int[n];
        // Arrays.fill(ans,-1);
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<i+n;j++){
        //         int idx=j%n;
        //         if(nums[i]<nums[idx]){
        //             ans[i]=nums[idx];
        //             break;
        //         }
        //     }
        // }
        // return ans;

        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer>st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(st.size()>0 && st.peek()<=nums[idx]){
                st.pop();
            }
            if(st.size()>0){
                ans[idx]=st.peek();
            }
            st.push(nums[idx]);
        }
        return ans;
    }
}
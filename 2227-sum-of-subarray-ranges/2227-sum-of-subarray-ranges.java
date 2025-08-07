class Solution {
    public long subArrayRanges(int[] nums) {
        // long sum=0;
        // for(int i=0;i<nums.length;i++){
        //     int min=nums[i];
        //     int max=nums[i];
        //     for(int j=i;j<nums.length;j++){
        //         min=Math.min(min,nums[j]);
        //         max=Math.max(max,nums[j]);
        //         sum+=max-min;
        //     }
        // }
        // return sum;

        return subarraySumMax(nums)-subarraySumMin(nums);
    }
    public long subarraySumMax(int[] nums){
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0 && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            left[i]=st.size()>0?st.peek():-1;
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && nums[st.peek()]<nums[i]){
                st.pop();
            }
            right[i]=st.size()>0?st.peek():n;
            st.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            long leftIdx=i-left[i];
            long rightIdx=right[i]-i;
            sum+=leftIdx*rightIdx*nums[i];
        }
        return sum;

    }
    public long subarraySumMin(int[] nums){
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0 && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            left[i]=st.size()>0?st.peek():-1;
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && nums[st.peek()]>nums[i]){
                st.pop();
            }
            right[i]=st.size()>0?st.peek():n;
            st.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            long leftIdx=i-left[i];
            long rightIdx=right[i]-i;
            sum+=leftIdx*rightIdx*nums[i];
        }
        return sum;

    }
}    
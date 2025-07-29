class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
       
        for(int i=0;i<n;i++){
             int leftSum=0,rightSum=0;
             if(i!=0)leftSum=i*nums[i]-prefix[i-1];
             if(i!=n-1)rightSum=prefix[n-1]-prefix[i]-nums[i]*(n-i-1);
             ans[i]=leftSum+rightSum;

        }
        return ans;

    }
}
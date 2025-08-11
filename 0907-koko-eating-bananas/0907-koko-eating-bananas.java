class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int left=1,right=max;
        
        int ans=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            long totalHour=hour(piles,mid);
            if(totalHour<=h){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    public long hour(int[] arr, int num){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]+(long)num-1)/num;
        }
        return sum;
    }
}
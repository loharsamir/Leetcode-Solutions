public class Solution {
    public int ShipWithinDays(int[] weights, int days) {
        int max=weights.Max();
        int limit=weights.Sum();
        int left=max,right=limit;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum=0;
            int day=days;
            foreach(int i in weights){
                sum+=i;
                if(sum>mid){
                    day--;
                    sum=i;
                }
            }
            if(sum<=mid)day--;
            if(day>=0){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
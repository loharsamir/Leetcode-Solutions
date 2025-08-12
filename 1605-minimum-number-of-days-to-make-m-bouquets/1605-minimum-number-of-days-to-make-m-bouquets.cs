public class Solution {
    public int MinDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.Length)return -1;
        int min=int.MaxValue;
        int max=int.MinValue;
        for(int i=0;i<bloomDay.Length;i++){
            min=Math.Min(min,bloomDay[i]);
            max=Math.Max(max,bloomDay[i]);
        }
        int left=min,right=max;
        int ans=int.MaxValue;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            int sum=0;
            foreach(int j in bloomDay){
                if(j<=mid){
                    count++;
                    
                }else{
                   sum+= count/k;
                    count=0;
                }
            }
            sum+=count/k;
            if(sum>=m){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }

        }
        
        return ans;
    }
}
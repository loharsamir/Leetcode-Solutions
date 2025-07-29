class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        max=sum;
        int r=cardPoints.length-1;
        for(int l=k-1;l>=0;l--){
            sum-=cardPoints[l];
            sum+=cardPoints[r];
            max=Math.max(max,sum);
            r--;
        }
        return max;
    }
}
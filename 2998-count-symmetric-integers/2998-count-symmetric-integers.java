class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String num=i+ "";
            int n=num.length();
            if (n% 2 != 0) continue;
            int leftSum=0;
            for(int j=0;j<n/2;j++){
                leftSum+=num.charAt(j)-'0';
            }
            int rightSum=0;
            for(int j=n/2;j<n;j++){
                rightSum+=num.charAt(j)-'0';
            }
            
            if(leftSum==rightSum){
                count++;
            }

        }
        return count;
    }
}
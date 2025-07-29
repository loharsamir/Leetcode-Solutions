class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // int sum=0;
        // int count=0;
        // for(int i=0;i<k;i++){
        //     sum+=arr[i];
        // }
        // int avg=sum/k;
        // if(avg>=threshold){
        //         count++;
        // }
        // for(int i=k;i<arr.length;i++){
        //     sum+=arr[i]-arr[i-k];
        //     avg=sum/k;
        //     if(avg>=threshold){
        //         count++;
        //     }
        // }
        // return count;

        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int avg=sum/k;
        int l=0;
        if(avg>=threshold){
                count++;
            }
        for(int r=k;r<arr.length;r++){
            sum+=arr[r]-arr[l++];
            avg=sum/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
    }
}